package gb.linkedlist;
import java.util.Iterator;

public class LinkedArrayIterator<T> implements Iterator<T>{

    private Node<T> ItrNode;
    private final Node<T> first;      

    public  LinkedArrayIterator(Node<T> first) {
        this.ItrNode = first;
        this.first = first;       
    }

    @Override
    public T next() {
        T item=ItrNode.item;
        ItrNode=ItrNode.next;
        return item;        
    }

    @Override
    public boolean hasNext() {
        
        return (ItrNode != null);
    }
}
