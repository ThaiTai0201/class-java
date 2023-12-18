import java.util.Scanner;
public class ChuyenHoaThanhThuong {
    public static void main (String[] aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap chuoi can chuyen doi thanh in thuong: ");
        String chuoi = sc.nextLine();
        sc.close();
        // tách chuỗi thành mảng kiểu char
        char[] chuoiTach = chuoi.toCharArray();
        for (int i = 0; i < chuoiTach.length; i++) {
            if (65 <= chuoiTach[i] && chuoiTach[i] <= 90)
                chuoiTach[i] += 32;
        }
        // gộp về lại thành chuỗi kiểu string
        chuoi = String.valueOf(chuoiTach);
        System.out.println("Chuoi sau khi chuyen doi: " + chuoi);
    }
}
