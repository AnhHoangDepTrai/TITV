public class StringReversal {
    public static String reverseString(String input) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        // Dua tung ky tu vao trong Stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        // Lay tung ky tu ben trong stack va ghep de tao chuoi dao nguoc
        // Cach 1
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
        // Cach 2
//        String reversed = "";
//        while (!stack.isEmpty()) {
//            reversed = reversed + stack.pop();
//        }
//        return reversed;
    }
}
