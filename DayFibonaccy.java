public class DayFibonaccy {
    public static void main(String[] args) {
        int n = 100; // Số lượng số Fibonacci cần xuất
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        long[] fibonacciSeries = new long[n];
        fibonacciSeries[0] = 1;
        fibonacciSeries[1] = 1;

        System.out.println("100 so Fibonacci dau tien:");
        System.out.print(fibonacciSeries[0] + " " + fibonacciSeries[1] + " ");

        for (int i = 2; i < n; i++) {
            // Tính số Fibonacci tiếp theo bằng tổng 2 số trước nó
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            System.out.println(fibonacciSeries[i]);
        }
    }
}
