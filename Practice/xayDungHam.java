// Xây dựng các hàm thực hiện các công việc sau:
// Nhập các giá trị cho một mảng.
// Tính tổng các phần tử chia hết cho 5 có trong mảng.
package Practice;

import java.util.Scanner;

public class xayDungHam {
    public static int[] inputArray(int n) {
        int[] arr = new int[n];
        System.out.println("So luong phan tu co trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sumAllElementDivisionBy5(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0)
                sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong phan tu co trong mang: ");
        int n = sc.nextInt();
        int[] arr = inputArray(n);
        int sum = sumAllElementDivisionBy5(arr);
        System.out.println("Tong cac phan tu chia het cho 5 trong mang: sum = " + sum);
        sc.close();
    }
}
