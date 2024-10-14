public class main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        int x = stack.pop();
        System.out.println(x);

        int y = stack.peek();
        System.out.println(y);

        int z = stack.pop();
        System.out.println(z);
    }
}
