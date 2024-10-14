public interface StackADT<T> {
    // Them 1 phan tu vao dinh cua Stack
    public void push(T element);
    // Tra ve va loai bo phan tu o Stack
    public T pop();

    // Tra ve nhung khong loai bo phan tu o dinh
    public T peek();

    public boolean isEmpty();
    public int size();
    public String toString();
}
