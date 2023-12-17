public class TongMangInt10PhanTu {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Tong 10 phan tu co trong mang a: sum(a[10]) = " + sum);
    }
}
