import java.util.Scanner;

class KtraNguyenAm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Character need to check:");
        char Character = sc.next().charAt(0);
        sc.close();
        boolean isVowel = false;

        switch (Character) {
            case 'u':
            case 'e':
            case 'o':
            case 'a':
            case 'i':
            case 'U':
            case 'E':
            case 'O':
            case 'A':
            case 'I':
                isVowel = true;
        }
        if (isVowel == true)
            System.out.println(Character + " is vowel!");
        else {
            if (('a' <= Character && Character <= 'z') || ('A' <= Character && Character <= 'Z'))
                System.out.println(Character + " is consonal!");
            else
                System.out.println(Character + " not alphabetical!");
            ;
        }
    }
}
