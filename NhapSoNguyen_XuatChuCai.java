import java.util.Scanner;

public class NhapSoNguyen_XuatChuCai {
    public static void importArray(int mangKiTu[], int doDaiMang, Scanner sc) {
        System.out.println("Nhap gia tri cho mang (ma cua ky tu): ");
        for (int i = 0; i < doDaiMang; i++) {
            System.out.print("Nhap gia tri cho phan tu thu [" + i + "]: ");
            mangKiTu[i] = sc.next().charAt(0);
        }
    }

    public static void exportArray(int mangKiTu[], int doDaiMang) {
        System.out.print("Mang duoi dang chu: ");
        for (int i = 0; i < doDaiMang; i++) {
            System.out.print((char)mangKiTu[i] + " ");
        }
        System.out.print("\nMa cua cac ky tu trong mang: ");
        for (int i = 0; i < doDaiMang; i++) {
            System.out.print(mangKiTu[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap do dai cua mang: ");
        int doDaiMang = sc.nextInt();
        int mangKiTu[] = new int[doDaiMang];

        importArray(mangKiTu, doDaiMang, sc);
        exportArray(mangKiTu, doDaiMang);

        sc.close();
    }
}
