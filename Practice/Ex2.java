package Practice;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao mot so nguyen");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        switch (n) {
            case 0:
                System.out.println("Khong");
                break;
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;
            default:
                System.out.println("Vui long nhap so tu 0 -> 9");
                break;
        }
        sc.close();
    }
}
