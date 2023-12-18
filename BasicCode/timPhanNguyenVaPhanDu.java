import java.util.Scanner;

public class timPhanNguyenVaPhanDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 = ");
        int num1 = sc.nextInt();
        System.out.println("num2 = ");
        int num2 = sc.nextInt();
        sc.close();

        int phanNguyen, phanDu;
        phanNguyen = num1 / num2;
        phanDu = num1 % num2;
        System.out.println("Phan nguyen cua phep chia: " + phanNguyen);
        System.out.println("Phan du cua phep chia: " + phanDu);
    }
}
