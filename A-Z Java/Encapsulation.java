// package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setPrice(30);

        System.out.println(l1.getPrice());
    }
}

// public void doWork() {

// private void doWork() {
//
// System.out.println("Working");
// }

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        // boolean isAdmin = false;
        boolean isAdmin = true;

        if (!isAdmin) {
            System.out.println("you can not set price");
        } else {
            this.price = price;
        }

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }
}
