public class TinhTungBinhCong {
    public static void main(String[] args) {
        Integer[] mangInt = {5, 10, 15};
        System.out.println("Trung binh cong-int: " + tinhTBC(mangInt) + "");

        Float[] mangF = {10.2f, 20.1f, 30.3f};
        System.out.println("Trung binh cong-float: " + tinhTBC(mangF) + "");

        Double[] mangD = {2.1, 3.2, 4.3};
        System.out.println("Trung binh cong-double: " + tinhTBC(mangD) + "");
    }


    public static <T> double tinhTBC(T[] mang) {
        double tong = 0;
        for (int i = 0; i < mang.length; i++) {
            double value = Double.valueOf(mang[i]+ "");
            tong += value;
        }
        return tong / mang.length;
    }
}
