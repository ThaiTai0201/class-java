// Viết chương trình nhập vào một số và kiểm tra xem số đó có chia hết cho 5 hay không?
package Practice;

import java.util.Scanner;

public class kTraChiaHetCho5{
    public static void main(String[] args){
        int n;
        System.out.println("Nhap so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 5 == 0)
            System.out.println("Chia het cho 5");
        else
            System.out.println("Khong chia het cho 5");
        sc.close();
    }
}