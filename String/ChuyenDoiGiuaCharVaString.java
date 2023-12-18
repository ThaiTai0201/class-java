public class ChuyenDoiGiuaCharVaString {
    public static void main(String[] aStrings) {
        // Char -> String
        char chuoi = 'a';
        // Cách 1: Dùng toString()
        String str1 = Character.toString(chuoi);
        System.out.println("\nUsing toString: " + str1);
        // Cách 2: Dùng valueOf()
        System.out.println("Using valueOf: " + str1 + "\n");

        // String -> Char
        String str2 = "Hello";
        // Dùng charAt
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            System.out.println("Ki tu o vi tri " + i + " la: " + ch);
        }
    }
}