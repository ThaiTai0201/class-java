package Practice;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("Nhap vao 3 so nguyen:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a + b > c && b + c > a && a + c > b)
            System.out.println("a, b, c la do dai 3 canh cua mot tam giac");
        else
            System.out.println("a, b, c khong la do dai 3 canh cua mot tam giac");
        sc.close();
    }
}
