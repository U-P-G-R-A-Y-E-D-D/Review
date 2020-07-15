package cz.osu;

public class Customer {
    private String companyName;
    private int ico;
    private Address address;

    public Customer() {
        this.address = new Address();
    }

    public Customer(String companyName, int ico, Address address) {
        this.address = new Address();
        this.companyName = companyName;
        this.ico = ico;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getIco() {
        return ico;
    }

    public void setIco(int ico) {
        this.ico = ico;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "companyName='" + companyName + '\'' +
                ", ico=" + ico +
                ", address=" + address +
                '}';
    }
}
