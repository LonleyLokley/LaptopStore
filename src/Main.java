import java.util.*;

public class Main {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        List<Laptop> laptops = LaptopIns.createLaptops();
        for (Laptop laptop : laptops) {
            store.addLaptop(laptop);
        }

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filters = new HashMap<>();
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("Выберите параметры поиска, \nВведите цифру для выбора.\n" +
                    "Если ничего не найдено - сбросьте фильтр.\n" +
                    "-------------------------------------------");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - HDD size");
            System.out.println("3 - ОС");
            System.out.println("4 - Бренд");
            System.out.println("8 - Сброс фильтра");
            System.out.println("9 - Показать все ноуты");
            System.out.println("0 - Выход");
            System.out.println("-------------------------------------------");
            int choice;
            while (true) {
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите число.");
                    scanner.next();
                }
            }

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            } else if (choice == 8) {
                filters.clear();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Введите мин ОЗУ(GB): ");
                    int minRam = scanner.nextInt();
                    filters.put(1, minRam);
                    break;
                case 2:
                    System.out.println("Введите мин HDD(GB): ");
                    int minStorage = scanner.nextInt();
                    filters.put(2, minStorage);
                    break;
                case 3:
                    System.out.println("Введите ОС: ");
                    String os = scanner.next();
                    filters.put(3, os);
                    break;
                case 4:
                    System.out.println("Введите Бренд: ");
                    String brand = scanner.next();
                    filters.put(4, brand);
                    break;
                case 9:
                    filters.clear();
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    continue;
            }
            Set<Laptop> fLaptops = store.filterLaptops(filters);
            System.out.println("============================================");
            for (Laptop laptop : fLaptops) {
                System.out.println(laptop);
            }
            System.out.println("============================================");
            System.out.println("Всего: " + fLaptops.size()+" выбрано.");
            System.out.println("============================================");

        }
    }
}