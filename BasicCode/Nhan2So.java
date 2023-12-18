import java.util.Scanner;
public class Nhan2So {
    public static void main(String[] args) {
        int num1, num2, dev;
        Scanner sc = new Scanner(System.in);

        System.out.print("num1 = ");
        num1 = sc.nextInt();

        System.out.print("num2 = ");
        num2 = sc.nextInt();
        sc.close();

        dev = num1 * num2;
        System.out.print("Tich 2 so: dev = " + dev);
    }
}
