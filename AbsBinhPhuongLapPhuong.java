import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class AbsBinhPhuongLapPhuong {
    public static void absBinhPhuong() {
        System.out.println("Tri tuyet doi binh phuong tu 1 -> 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("abs(" + i + ")= " + (int) abs(pow(i, 2)));
        }
    }

    public static void absLapPhuong() {
        System.out.println("=====================================");
        System.out.println("Tri tuyet doi lap phuong tu 1 -> 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("abs(" + i + ")= " + (int) abs(pow(i, 3)));
        }
    }

    public static void main(String[] args) {
        absBinhPhuong();
        absLapPhuong();
    }
}
