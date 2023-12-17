public class TaoMaTran2x3 {
    public static void main(String[] args) {
        // Tạo ma trận 2x3
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Xuất ma trận ra màn hình
        System.out.println("Ma tran 2x3:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();  // Xuống dòng sau mỗi hàng
        }
    }
}
