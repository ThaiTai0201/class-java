public class VietHoaKiTuDauTien {
    public static void main(String[] aStrings) {
        String chuoi = "java";
        System.out.println("\nChuoi ban dau: " + chuoi);
        // Tách kí tự đầu và phần còn lại của chuỗi ra
        // Tách kí tự đầu
        String firstLetter = chuoi.substring(0, 1);
        // Tách phần còn lại
        String remainingLetter = chuoi.substring(1, chuoi.length());
        // dùng toUpperCase()
        firstLetter = firstLetter.toUpperCase();
        // Gộp 2 phần đã tách lại thành chuỗi
        chuoi = firstLetter + remainingLetter;
        System.out.println("Chuoi sau khi thay doi: " + chuoi + "\n");

    }
}
