//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Persion p = new Persion("Do Anh Hoang", "Viet Nam");
        Persion p1 = new Persion("Do Anh Hoang", "Ha Lan");
        Persion p2 = new Persion("Do Anh Hoang", "Ao");
        Persion p3 = new Persion("Do Anh Hoang", "Uc");
        Persion p4 = new Persion("Do Anh Hoang", "Nga");

        p.setNext(p1);
        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);

        Persion cur = p;
        while(true){
            System.out.println(cur);
            cur = cur.getNext();
            if(cur == null) break;
        }
    }
}