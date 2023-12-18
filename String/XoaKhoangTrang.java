class XoaKhoangTrang {
    public static void main(String[] aStrings) {
        String sentence = "T r a n T h a i T a i";
        System.out.println("\nChuỗi ban đầu: " + sentence);
        sentence = sentence.replaceAll("T", "t");
        sentence = sentence.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + sentence);
    }
}