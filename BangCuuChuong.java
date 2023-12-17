public class BangCuuChuong {
    public static void main(String[] args) {
        int i, k;
        for (i = 2; i <= 9; i++) {
            System.out.println("\tCuu chuong " + i);
            for (k = 1; k <= 10; k++) {
                System.out.println("\t" + i + " * " + k + " = " + (i * k));
            }
            System.out.println("============================");
        }
    }
}
