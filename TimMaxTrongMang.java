import java.util.Scanner;

public class TimMaxTrongMang {
    public static int[] TaoMang() {
        Scanner sc = new Scanner(System.in);

        System.out.print("So luong phan tu co trong mang a: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\ta[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        sc.close();
        return a;
    }

    public static int TimMax(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (max < a[i])
                max = a[i];
        System.out.print("Phan tu lon nhat trong mang a: " + max);
        return max;
    }

    public static void main(String[] args) {
        int a[] = TaoMang();
        TimMax(a);
    }
}
