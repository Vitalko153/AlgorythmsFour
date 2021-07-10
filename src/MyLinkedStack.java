import java.util.EmptyStackException;

public class MyLinkedStack<E> {

    private MyLinkedList<E> list = new MyLinkedList<>();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public E pop() {
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    public E peek() {
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public void push(E item) {
        list.insertLast(item);
    }
}
