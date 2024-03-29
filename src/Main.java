public class MyList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }


    public int size() {
        return size;
    }


    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
}
