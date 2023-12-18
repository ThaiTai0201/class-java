import java.util.Scanner;

public class Cong2So {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("num1 = ");
        num1 = sc.nextInt();

        System.out.print("num2 = ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("sum = " + sum);
        sc.close();
    }
}
