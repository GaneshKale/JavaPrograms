package Mall;

import java.lang.invoke.SwitchPoint;

public class InvoiceService {
    public void printInvoice(Item items[]) {
        double totalGST = 0;
        double totalPrice=0;

        for (int i=0;i<items.length;i++)
        {
          double gst=items[i].getGst();
          totalGST = totalGST+gst;

          printInvoiceItemBlock(items[i],gst);
          totalPrice +=(items[i].price*items[i].quantity)+gst;
        }
        System.out.println("Total:-" +(totalGST+totalPrice));
    }

    private void printInvoiceItemBlock(Item item,double gst) {
        System.out.println("Name:-"+item.name+"\t"+"price:-"+item.price+"\t"+"Quantity:-"+item.quantity+ "\t"+"GST:-"+gst+"\t"+"Itemwith quantity:-"+"\t"+(item.price*item.quantity));
    }
}
