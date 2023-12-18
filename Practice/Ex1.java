package Practice;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao mot so nguyen: ");
        java.util.Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Day la mot so nguyen duong.");
        } else {
            System.out.println("Day la mot so nguyen am.");
        }
        sc.close();
    }
}
