import java.util.Scanner;
public class CheckNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("year = ");
        year = sc.nextInt();
        sc.close();

        if (year % 400 == 0){
            System.out.print(year + " is leap year!");
        }
        else {
            System.out.print(year + " is not leap year!");
        }

    }
}