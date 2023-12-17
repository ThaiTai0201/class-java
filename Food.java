import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Food {
    protected String code;
    protected String name;
    protected String productionDate;
    protected String expirationDate;
    protected double importPrice;
    protected double sellingPrice;
    protected String unit;
    protected String productionLocation;
    protected int quantityInCart;

    public Food(String code, String name, String productionDate, String expirationDate, double importPrice,
            double sellingPrice, String unit, String productionLocation, int quantityInCart) {
        if (code == null) {
            throw new IllegalArgumentException("Code can't be negative!");
        }
        if (productionDate == null) {
            throw new IllegalArgumentException("Production date can't be negative!");
        }
        if (expirationDate == null) {
            throw new IllegalArgumentException("Expiration date can't be negative!");
        }
        if (unit == null) {
            throw new IllegalArgumentException("Unit can't be negative!");
        }
        if (productionLocation == null) {
            throw new IllegalArgumentException("Production Location can't be negative!");
        }
        if (importPrice < 0 || sellingPrice < 0 || quantityInCart < 0) {
            throw new IllegalArgumentException("Prices and stock quantity in stock can't be negative.");
        }
        this.code = code;
        this.name = name;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.importPrice = importPrice;
        this.sellingPrice = sellingPrice;
        this.unit = unit;
        this.productionLocation = productionLocation;
        this.quantityInCart = quantityInCart;
    }

    public double getTotalPrice() {
        return sellingPrice * quantityInCart;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter code: ");
        code = scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter production date: ");
        productionDate = scanner.nextLine();
        System.out.print("Enter expiration date: ");
        expirationDate = scanner.nextLine();
        System.out.print("Enter import price: ");
        importPrice = scanner.nextDouble();
        System.out.print("Enter selling price: ");
        sellingPrice = scanner.nextDouble();
        System.out.print("Enter unit: ");
        unit = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter production location: ");
        productionLocation = scanner.nextLine();
        System.out.print("Enter quantityInCart: ");
        quantityInCart = scanner.nextInt();
        scanner.close();
    }

    public void output() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Production Date: " + productionDate);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Selling Price: " + sellingPrice);
        System.out.println("Unit: " + unit);
        System.out.println("Production Location: " + productionLocation);
        System.out.println("quantityInCart: " + quantityInCart);
    }
}

public class BottledDrink extends Food {
    private double volume;

    public BottledDrink(String code, String name, String productionDate, String expirationDate, double importPrice,
            double sellingPrice, String unit, String productionLocation, int quantityInCart, double volume) {
        super(code, name, productionDate, expirationDate, importPrice, sellingPrice, unit, productionLocation,
                quantityInCart);
        this.volume = volume;
    }
}

public class AlcoholDrink extends BottledDrink {
    public double alcoholContent;

    public AlcoholDrink(String code, String name, String productionDate, String expiryDate, double importPrice,
            double sellingPrice, String unit, String origin, int stockquantityInCart, double volume,
            double alcoholContent) {
        super(code, name, productionDate, expiryDate, importPrice, sellingPrice, unit, origin, stockquantityInCart,
                volume);
        this.alcoholContent = alcoholContent;
    }
}

public class Customer {
    private String phoneNumber;
    private String name;
    private String address;
    private String customerType;

    public Customer(String phoneNumber, String name, String address, String customerType) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.customerType = customerType;
    }
}

public class Order {
    private String orderCode;
    private String customerPhoneNumber;
    private HashMap<Food, Integer> items;

    public Order(String orderCode, String customerPhoneNumber, HashMap<Food, Integer> items) {
        this.orderCode = orderCode;
        this.customerPhoneNumber = customerPhoneNumber;
        this.items = new HashMap<>();
    }

    private static final double VAT_RATE = 0.1;

    public double calculateTotalPayment() {
        double totalPayment = 0;
        for (Map.Entry<Food, Integer> entry : items.entrySet()) {
            Food food = entry.getKey();
            int quantityInCart = entry.getValue();
            totalPayment += food.getTotalPrice() * quantityInCart;
        }
        return totalPayment + (totalPayment * VAT_RATE);
    }
}

public class Promotion {
    public static double applyDiscount(double totalPayment, String customerType) {
        if (customerType.trim().equalsIgnoreCase("VIP")) {
            return totalPayment * 0.95;
        } 
        else {
            return totalPayment;
        }
    }
}