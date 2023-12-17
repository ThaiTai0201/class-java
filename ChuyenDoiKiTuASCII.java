import java.util.Scanner;

public class ChuyenDoiKiTuASCII {
    // Nhập vào một ký tự. Xuất ra màn hình mã số của ký tự vừa nhập
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ki tu can chuyen doi: ");
        String chuoiKiTu = sc.nextLine();
        
        System.out.println("Ma so ASCII cua tung ki tu trong chuoi: ");
        for (int i = 0; i < chuoiKiTu.length(); i++) {
            char kiTu = chuoiKiTu.charAt(i);
            int maASCII = (int) kiTu;
            System.out.println("Ki tu '" + kiTu + "' : " + maASCII);
        }
        sc.close();
        /*
        // In bảng mã ASCII
        for (int i = 0; i < 128; i++) {
            if (i == 7)
                continue;
            System.out.println("Ki tu: " + (char)i + "\tMa so ASCII: " + i);
        }*/
    }
}
