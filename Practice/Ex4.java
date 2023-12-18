package Practice;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("Nhap vao 3 so nguyen: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
            System.out.println("a, b, c la do dai 3 canh cua tam giac vuong");
        else
            System.out.println("a, b, c khong la do dai 3 canh cua tam giac vuong");
        sc.close();
    }
}
