package EX2;

public class Pers_Queue<T> {
    private final int size;
    private final T[] queue;
    private int pos;

    public Pers_Queue(int size) {
        this.size = size;
        this.pos = 0;
        queue = (T[]) new Object[size];
    }

    public void set(T el) {
        if (pos > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            queue[pos] = el;
            pos++;
        }
    }

    public T get(int index) throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            return queue[index];
        }
    }
}
