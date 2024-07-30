import java.util.*;

public class LaptopIns {
    public static  List<Laptop> createLaptops() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Model0", 8, 256, "Windows", "Asus"));
        laptops.add(new Laptop("Model1", 8, 256, "Windows", "Asus"));
        laptops.add(new Laptop("Model2", 16, 512, "MacOS", "Apple"));
        laptops.add(new Laptop("Model3", 8, 1024, "Linux", "Lenovo"));
        laptops.add(new Laptop("Model4", 16, 2048, "Windows", "Huawei"));
        laptops.add(new Laptop("Model5", 16, 1024, "Windows", "HP"));
        laptops.add(new Laptop("Model6", 8, 2048, "none", "Lenovo"));
        return laptops;
    }
}
