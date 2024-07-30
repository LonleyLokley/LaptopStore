
public class Laptop {
    private String model;
    private int ram; //  GB
    private int storage; //  GB
    private String os;
    private String brand;

    public Laptop(String model, int ram, int storage, String os, String brand) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.brand = brand;
    }


    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public String getOs() {
        return os;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Ноутбук {" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}