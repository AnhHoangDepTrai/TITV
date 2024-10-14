public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Duyet cac phan tu
    public void Traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }

    // Add 1 Node to first of the list
    public void addFirst(T data) {
        //Node<T> newNode = new Node<>(data, this.head);
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Add 1 Node to last of the list
    public void addLast(T data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node<T> newNode = new Node<>(data, null);

            Node<T> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    // Them vao giua 1 node
    public void insertAfter(T key, T toInsert) {
        // Buoc 2: di tim vi tri cua key
        Node<T> tmp = head;
        // Tim node chua key
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }
        // Tim ra duoc node chua key, hoac la di den cuoi ll

        // Them vao khi tmp <> null
        if (tmp != null) {
            // Buoc 1
//            Node<T> newNode = new Node<>();
//            newNode.setData(toInsert);
            // 2
//            newNode.setNext(tmp.getNext());

            // 1 + 2
            Node<T> newNode = new Node<>(toInsert, tmp.getNext());

            // 3
            tmp.setNext(newNode);
        }
    }

    // Xóa 1 node
    public boolean remove(T key) {
        if (head == null)
//            throw new RuntimeException("List is empty");
            return false;

        // Xoa luon neu key o vi tri dau tien
        if (head.getData() == key) {
            this.head = head.getNext();
            return true;
        }
        // tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;
        while (cur.getNext() != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }
        if (cur == null) {
//            throw new RuntimeException("List is empty");
//            prev.setNext(cur.getNext());
            return false;
        }
        prev.setNext(cur.getNext());
        return true;

    }

    public boolean isEmpty() {
//        if(head==null)
//            return true;
//        else
//            return false;

        return head == null;
    }

    public int size() {
        int count = 0;

        Node<T> tmp = head;
        while (tmp != null) {
            // Tang gia tri
            count++;
            // Chuyen den phan tu tiep theo
            tmp = tmp.getNext();
        }

        return count;
    }
}
