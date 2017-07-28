package Mall;

public class Toy extends Item
{

    public static final int GST_RATE = 12;
        Toy(String name,int price,int quantity)
        {
            this.name=name;
            this.price=price;
            this. quantity=quantity;

        }
        public double getGst()
        {
        double gst = price * GST_RATE / 100;
        return gst;
        }
}


