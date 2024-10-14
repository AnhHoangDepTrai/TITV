import java.util.Random;
import java.util.Scanner;

public class BaiTapMang {
     float a[];
        int n;

        public BaiTapMang(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao luong phan tu cua mang: ");
            n = sc.nextInt();
            a = taoMangSoThuc(n);
            printA();
        }


    // viet phuong thuc in ra mang
    public void printA(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // viet phuong thuc tra ve mang so thuc n phan tu
    public float[] taoMangSoThuc(int n){
        Random r = new Random();

        float[] temp = new float[n];
        for (int i = 0; i < n; i++) {
            temp[i] = r.nextFloat();
        }
        return temp;
    }

    // add 1 phan tu x vao cuoi mang
    public void addX(float x){
            // tang n len
        n = n + 1;
        // tao mang temp
        float[] temp = new float[n];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
         // them x vao cuoi mang
        temp[n - 1] = x;
        // gan lai cho mang ban dau
        a = temp;
    }

    // cong 2 phan dau tien
    public void sum2FirstElement(){
            float sum = 0;
            for (int i = 0; i < 2 && i < a.length; i++) {
                sum += a[i];
            }
        System.out.println("tong 2 phan tu dau tien la : " + sum);
    }

     // tong mang
    public void sumA(){
            float sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
        System.out.println("tong mang la: " + sum);
    }

    // in phan tu nho nhat mang
    public void smallest(){
            float smallest = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < smallest) {
                    smallest = a[i];
                }
            }
            System.out.println("phan tu nho nhat la :" + smallest);
    }

    // in gia tri ngau nhien
    public void random(){
            Random r = new Random();
            int index = r.nextInt(n);
        System.out.println("A["+index+"] ="+a[index]);
    }


    public static void main(String[] args) {
        BaiTapMang b = new BaiTapMang();
        b.addX(1.2f);
        System.out.println();
        b.printA();
        System.out.println();
        b.sum2FirstElement();
        System.out.println();
        b.sumA();
        b.smallest();
        b.random();
    }
}
