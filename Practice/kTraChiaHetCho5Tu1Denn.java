// Viết chương trình nhập vào một số nguyên n. Tính tổng các số chia hết cho 5 trong khoảng từ 1 đến n.
package Practice;

import java.util.Scanner;

public class kTraChiaHetCho5Tu1Denn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 0; i <= n; i++){
            if (i % 5 == 0)
                sum += i;
        }
        System.out.println("Tong cac so nguyen chia het cho 5 tu 1 den n: " + sum);
        sc.close();
    }
}
