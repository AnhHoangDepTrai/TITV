//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main<T> {
    public static void main(String[] args) {
        Person p = new Person("zhangsan", "hangzhou");
        Person p1 = new Person("Hoang", "VietNam");
        Person p2 = new Person("SA", "O");
        Person p3 = new Person("AM", "Q");
        Person p4 = new Person("HT", "G");


        Node<Person> node1 = new Node<>();
        node1.setData(p);

        Node<Person> node2 = new Node<>();
        node2.setData(p1);

        Node<Person> node3 = new Node<>();
        node3.setData(p2);

        Node<Person> node4 = new Node<>();
        node4.setData(p3);

        Node<Person> node5 = new Node<>();
        node5.setData(p4);


        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        Node<Person> head = node1;
        while (true) {
            System.out.println(head.getData());
            head = head.getNext();
            if (head == null) break;
        }

    }
}