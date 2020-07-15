package cz.osu;

public class Main {

    public static void main(String[] args) {

        /*Invoice faktura = new Invoice();

        faktura.setInvoiceNumber(1);
        faktura.getCustomer().getAddress().setStreet("ulice");
        faktura.getCustomer().getAddress().setCity("mesto");
        faktura.getCustomer().getAddress().setZipCode(12345);
        faktura.getCustomer().setCompanyName("nazev spolecnosti");
        faktura.getCustomer().setIco(123456789);
        faktura.getItem1().setTitle("item1");
        faktura.getItem1().setPrice(99.5);
        faktura.getItem2().setTitle("item2");
        faktura.getItem2().setPrice(100.5);

        System.out.println(faktura);*/

        Pc pc = new Pc();
        pc.setCpu("processor");
        pc.setGpu("Nvidia XXXTi");
        pc.getHdd().setName("nejaky mega velky pevny disk");
        pc.getHdd().setCapacity(100000);
        pc.getSsd().setName("maly rychly systemovy disk");
        pc.getSsd().setCapacity(128);

        System.out.println(pc);
    }
}
