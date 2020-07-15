package cz.osu;

public class InvoiceItem {
    private String title;
    private double price;

    public InvoiceItem() {
    }

    public InvoiceItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            this.price = -1 * price;
        } else {
            this.price = price;
        }

        this.price = Math.abs(price);

        this.price = (price < 0) ? price * -1 : price;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
