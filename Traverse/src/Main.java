//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("Do Anh Hoang");
        ll.addLast("Cupperdeptrai");
        ll.addFirst("Sieu dep trai :V");

        ll.insertAfter("Cupperdeptrai", "Mup rup");
        ll.Traverse();
        System.out.println("________________________________");
        System.out.println(ll.remove("Do Anh Hoang"));

        System.out.println("--------------");
        System.out.println("Check empty " + ll.isEmpty());
        System.out.println("Size: " + ll.size());
    }
}