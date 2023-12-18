// Viết chương trình cho một mảng số nguyên gồm n phần tử. 
// Tính tổng các số chia hết cho 5 có trong mảng số nguyên đó.
package Practice;

import java.util.Scanner;

public class tongSoChiaHetCho5TrongMang {
    public static void main(String[] aStrings) {
        System.out.println("So phan tu co trong mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + (i + 1) + "]= ");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0)
                sum += a[i];
        }
        System.out.println("Tong cac phan tu chia het cho 5 trong mang: sum = " + sum);
        sc.close();
    }
}
