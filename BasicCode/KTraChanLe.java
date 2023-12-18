import java.util.Scanner;
public class KTraChanLe {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        a = sc.nextInt();
        sc.close();
        
        if (a % 2 == 0)
            System.out.print(a + " la so chan");
        else
            System.out.print(a + " la so le");
        
    }
}