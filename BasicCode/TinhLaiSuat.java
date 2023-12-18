import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        float tienGui, laiSuatHangNam, thoiGianGui, tongTienTK;
        Scanner sc = new Scanner(System.in);
        System.out.println("So tien gui($): ");
        tienGui = sc.nextFloat();
        System.out.println("Lai suat hang nam(%): ");
        laiSuatHangNam = sc.nextFloat();
        System.out.println("Thoi gian gui(nam): ");
        thoiGianGui = sc.nextFloat();
        sc.close();

        tongTienTK = tienGui + ((tienGui * laiSuatHangNam * thoiGianGui) / 100);
        System.out.println("Tong tien gui tiet kiem cua khach hang: " + tongTienTK + "$");
    }
}
