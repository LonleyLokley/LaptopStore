import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }



    public Set<Laptop> filterLaptops(Map<Integer, Object> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean passFilter = true;
            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case 1:
                        if (laptop.getRam() < (int) value) {
                            passFilter = false;
                        }
                        break;
                    case 2:
                        if (laptop.getStorage() < (int) value) {
                            passFilter = false;
                        }
                        break;
                    case 3:
                        if (!laptop.getOs().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                    case 4:
                        if (!laptop.getBrand().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                }
                if (!passFilter) {
                    break;
                }
            }
            if (passFilter) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }

}
