import java.util.Arrays;

public class ArrayInterger10PhanTu {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 7, 3, 10, 4, 6, 9};
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
