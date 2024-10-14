import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {
    private int top;
    private T[] stack;
    private final int DEFAULT_CAPACITY = 100;

    // Tao 1 stack rong voi kich thuoc mac dinh
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    // Tao 1 stack rong voi kich thuoc duoc truyen vao
    public ArrayStack(int capacityCapacity) {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public void expandCapacity() {
        T[] newStack = (T[]) (new Object[stack.length * 2]);// Tao mang moi lon hon 2 lan mang cu

        // Copy mang cu sang mang moi
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
            stack = newStack;
        }
    }

    @Override
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }


    @Override
    public T pop() { // Lay ra
//       if(isEmpty())
//           throw new EmptyStackException();
//       top--;
//       T result = stack[top]; // Lay phan tu o dinh cua Stack
//        stack[top] = null;
//        return result;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = stack[top - 1]; // Adjusted to correctly refer to the top element
        stack[top - 1] = null; // Nullify the popped element
        top--;
        return result;
    }

    @Override
    public T peek() { // lay ma khong xoa
        if (isEmpty())
            throw new EmptyStackException();
        return stack[top - 1];
    }

    @Override
    public int size() {
        return this.top;
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }
}
