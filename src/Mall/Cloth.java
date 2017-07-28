package Mall;

public class Cloth extends Item {
    public  static final int GST_RATE=18;
        Cloth(String name,int price,int quantity)
        {
            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }
    public double getGst()
    {
        double gst=price*GST_RATE/100;
        return gst;
    }
}
