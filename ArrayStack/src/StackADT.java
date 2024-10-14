public interface StackADT<T> {
    //    public void push(Object element) {// Them vao
////        if (size() == stack.length) {
////            expandCapacity(); // mo rong mang
////            stack[top] = (T) element;
////            top++;
////        }
//
//    }
    void push(T element);


    public T pop();
    public T peek();
    public int size();
    public boolean isEmpty();
    public String toString();
    public void expandCapacity();

}
