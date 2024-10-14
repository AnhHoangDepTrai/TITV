package Generic_;

public class Test {
    public static void main(String[] args) {
        //vi du 1
        Dictionary<String, String> d1 = new Dictionary<>("hello", "world");
        System.out.println(d1.toString());

        Dictionary[] tuDIenAnhViet = new Dictionary[10];
        tuDIenAnhViet[0] = new Dictionary<>("hello", "world");
        tuDIenAnhViet[1] = new Dictionary<>("penuts", "lac");
        tuDIenAnhViet[2] = new Dictionary<>("math", "toan");
        tuDIenAnhViet[3] = new Dictionary<>("history", "lich su");

        for (int i = 0; i < 4; i++) {
            System.out.println(tuDIenAnhViet[i].toString());
        }


        // vi du 2
        Dictionary<Integer, Character>[] bangMaAscii = new Dictionary[256];
        bangMaAscii[0] = new Dictionary<>(32, ' ');
        bangMaAscii[1] = new Dictionary<>(32, '!');

    }
}
