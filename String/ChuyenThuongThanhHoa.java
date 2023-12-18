import java.util.Scanner;
public class ChuyenThuongThanhHoa {
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap chuoi can chuyen thanh in hoa: ");
        String chuoi= sc.nextLine();
        sc.close();
        // chuyển đổi chuỗi ban đầu thành một mảng kiểu char
        char[] chuoiTach = chuoi.toCharArray();
        for (int i = 0; i < chuoiTach.length; i++) {
            if (97 <= chuoiTach[i] && chuoiTach[i] <= 122)
                chuoiTach[i] -= 32;
        }
        // chuyển đổi mảng char về string
        chuoi = String.valueOf(chuoiTach);
        System.out.println("Chuoi sau khi thay doi: " + chuoi);
    }    
}
