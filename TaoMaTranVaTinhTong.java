import java.util.Scanner;

public class TaoMaTranVaTinhTong {
    // Tạo ma trận bất kì và tính tổng các phần tử có trong 1 hàng bất kì của ma
    // trận đã tạo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số lượng hàng và cột của ma trận
        System.out.print("Nhap so hang co trong ma tran: row(s) = ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot co trong ma tran: col(s) = ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];

        // Nhập giá trị từng phần tử trong ma trận
        System.out.println("Nhap gia tri cho cac phan tu trong ma tran la: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Xuất ma trận đã tạo
        System.out.println("\nMa tran da tao: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Tính tổng các phần tử trong 1 hàng
        System.out.print("Nhap hang can tinh tong: ");
        int selectedRow = sc.nextInt() - 1;
        if (selectedRow < 0 || selectedRow >= rows)
            System.out.println("Invalid value!!!");
        else {
            int sum = 0;
            for (int j = 0; j < cols; j++)
                sum += matrix[selectedRow][j];
            System.out.println("Tong cac phan tu trong hang " + (selectedRow + 1) + " : " + sum);
        }

        sc.close();
    }
}
