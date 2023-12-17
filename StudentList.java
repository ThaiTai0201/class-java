import java.util.Scanner;

public class StudentList {
    public static void ExportStuList(char[][] name, char[][] code, float[][] scores, int quantity) {
        System.out.println("\n\t----------Student List Imported----------");
        for (int k = 0; k < quantity; k++) {
            System.out.println("Ma so hoc sinh " + (k + 1) + ": " + new String(code[k]));
            System.out.println("Ho ten hoc sinh " + (k + 1) + ": " + new String(name[k]));
            for (int i = 0; i < 3; i++) {
                System.out.println("Diem mon hoc " + (k + 1) + ": " + scores[k][i]);
            }
            System.out.println();
        }
        System.out.println("\t----------GoodBye---------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] name;
        char[][] code;
        float[][] scores;

        System.out.print("So luong hoc sinh: ");
        int quantity = 0;

        // Kiểm tra lỗi khi người dùng nhập số lượng
        try {
            quantity = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Vui long nhap 1 so nguyen.");
            System.exit(1);
        }

        scanner.nextLine();
        name = new char[quantity][];
        code = new char[quantity][];
        scores = new float[quantity][3];

        for (int k = 0; k < quantity; k++) {
            System.out.print("Ma so hoc sinh " + (k + 1) + ": ");
            code[k] = scanner.nextLine().toCharArray();
            System.out.print("Ho ten hoc sinh " + (k + 1) + ": ");
            name[k] = scanner.nextLine().toCharArray();

            // Kiểm tra lỗi khi người dùng nhập điểm
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.print("Nhap diem mon hoc " + (i + 1) + ": ");
                    scores[k][i] = scanner.nextFloat();
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap 1 so thuc.");
                System.exit(1);
            }

            scanner.nextLine();
        }
        scanner.close();
        ExportStuList(name, code, scores, quantity);
    }
}
