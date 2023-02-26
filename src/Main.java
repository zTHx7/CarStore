import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Car> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        while (true) {
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    final String make = scanner.next();
                    final String model = scanner.next();
                    final int year = scanner.nextInt();
                    final double price = scanner.nextDouble();
                    create(make, model, year, price);
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    int id = scanner.nextInt();
                    final String updateMake = scanner.next();
                    final String updateModel = scanner.next();
                    final int updateYear = scanner.nextInt();
                    final double updatePrice = scanner.nextDouble();
                    update(id, updateMake, updateModel, updateYear, updatePrice);
                    break;
                case 4:
                    id = scanner.nextInt();
                    delete(id);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Select Options");
                    break;
            }
        }
    }

    private static void create(String make, String model, int year, double price) {
        Car car = new Car(make, model, year, price);
        list.add(car);
    }
    private static void read() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(i + ". Make: %s, Model: %s, Year: %s, Price: %s\n", list.get(i).getMake(), list.get(i).getModel(), list.get(i).getYear(), list.get(i).getPrice());
        }
    }
    private static void update(int id, String make, String model, int year, double price) {
        list.get(id).setMake(make);
        list.get(id).setModel(model);
        list.get(id).setYear(year);
        list.get(id).setPrice(price);
    }
    private static void delete(int id) {
        list.remove(id);
    }
}