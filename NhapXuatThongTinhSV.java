import java.util.ArrayList;
import java.util.Scanner;

public class NhapXuatThongTinhSV {
    // Lớp để lưu trữ thông tin của một sinh viên
    static class Student {
        int ID;
        String name, dayOfBirth;

        Student(int ID, String name, String dayOfBirth) {
            this.ID = ID;
            this.name = name;
            this.dayOfBirth = dayOfBirth;
        }
    }

    // Nhập thông tin
    public static ArrayList<Student> importStudentData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of student on the list: ");
        int num = sc.nextInt();
        sc.nextLine();

        // Danh sách để lưu trữ thông tin của các sinh viên
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Data of student " + (i + 1));
            System.out.print("ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Day of birth: ");
            String dayOfBirth = sc.nextLine();

            // Tạo đối tượng sinh viên và thêm vào danh sách
            Student student = new Student(ID, name, dayOfBirth);
            studentList.add(student);
        }
        sc.close();

        return studentList;
    }

    // Xuất thông tin
    public static void exportStudentData(ArrayList<Student> studentList) {
        System.out.println("\nImported student list: ");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Name: " + studentList.get(i).name);
            System.out.println("ID: " + studentList.get(i).ID);
            System.out.println("Day of birth: " + studentList.get(i).dayOfBirth);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Nhập thông tin sinh viên và lưu vào danh sách
        ArrayList<Student> students = importStudentData();

        // Xuất danh sách sinh viên
        exportStudentData(students);
    }
}
