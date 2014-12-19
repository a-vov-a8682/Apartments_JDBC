package ua.kiev.prog;

public class Main {
    public static void main(String[] args) {
        RequestsImpl r = new RequestsImpl();
        r.getByDistrict("Podolskiy");
        System.out.println();
        r.getByAddress("Gnata Yury 12, app.15");
        System.out.println();
        r.getBySquare(62);
        System.out.println();
        r.getByRoom(3);
        System.out.println();
        r.getByPrice(1500000);
    }
}
