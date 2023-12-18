import java.util.Scanner;
public class VietHoaChuCaiDau {
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner(System.in);
        String HoVaTen;
        System.out.println("\nHo va ten: ");
        HoVaTen = sc.nextLine();
        sc.close();
        char[] charHoVaTen = HoVaTen.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charHoVaTen.length; i++) {
            if (Character.isLetter(charHoVaTen[i])) {
                if (foundSpace) {
                    charHoVaTen[i] = Character.toUpperCase(charHoVaTen[i]);
                    foundSpace = false;
                }
            }
            else 
                foundSpace = true;
        }
        HoVaTen = String.valueOf(charHoVaTen);
        System.out.println("Ho va ten da chinh sua: " + HoVaTen);
    }
}
