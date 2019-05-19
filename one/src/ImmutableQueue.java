import java.util.LinkedList;

public class ImmutableQueue<T> implements Queue<T> {
    private LinkedList<T> list;

    public ImmutableQueue() {
        this.list = new LinkedList<>();
    }

    private ImmutableQueue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public Queue<T> enQueue(T t) {
        LinkedList<T> copiedList = (LinkedList<T>) this.list.clone();
        copiedList.offer(t);
        return new ImmutableQueue<>(copiedList);
    }

    @Override
    public Queue<T> deQueue() {
        LinkedList<T> copiedList = (LinkedList<T>) this.list.clone();
        copiedList.poll();
        return new ImmutableQueue<>(copiedList);
    }

    @Override
    public T head() {
        return this.list.peek();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
