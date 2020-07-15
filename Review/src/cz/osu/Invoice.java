package cz.osu;

public class Invoice {
    private int invoiceNumber;
    private double totalPrice;
    private InvoiceItem item1;
    private InvoiceItem item2;
    private Customer customer;

    public Invoice() {
        this.customer = new Customer();
        this.item1 = new InvoiceItem();
        this.item2 = new InvoiceItem();
    }

    public Invoice(int invoiceNumber, double totalPrice, InvoiceItem item1, InvoiceItem item2, Customer customer) {
        this.customer = new Customer();
        this.item1 = new InvoiceItem();
        this.item2 = new InvoiceItem();
        this.invoiceNumber = invoiceNumber;
        this.totalPrice = totalPrice;
        this.item1 = item1;
        this.item2 = item2;
        this.customer = customer;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getTotalPrice() {
        totalPrice = item1.getPrice() + item2.getPrice();
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public InvoiceItem getItem1() {
        return item1;
    }

    public void setItem1(InvoiceItem item1) {
        this.item1 = item1;
    }

    public InvoiceItem getItem2() {
        return item2;
    }

    public void setItem2(InvoiceItem item2) {
        this.item2 = item2;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "\ninvoiceNumber=" + invoiceNumber +
                ",\n totalPrice=" + getTotalPrice() +
                ",\n item1=" + item1 +
                ",\n item2=" + item2 +
                ",\n customer=" + customer +
                "\n}";
    }
}
