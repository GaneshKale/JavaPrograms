package Mall;

import java.util.Scanner;

public class MallApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item t = toyScanner("teddy", 1000, 2);
        Item cl = ClothScanner("Denium", 500, 2);
        Item items[] = new Item[2];
        items[0]= t;
        items[1]=cl;
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.printInvoice(items);
    }

    private static Cloth ClothScanner(String name, int price, int quantity) {
        return new Cloth(name, price, quantity);
    }

    private static Toy toyScanner(String name, int price, int quantity) {
        return new Toy(name, price, quantity);
    }
}
