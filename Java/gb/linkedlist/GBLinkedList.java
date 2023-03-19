package gb.linkedlist;
import java.util.Iterator;
import java.util.NoSuchElementException;

import gb.GBList;

public class GBLinkedList<T> implements GBList<T> {
    transient int sizeLinkedList=0;
    transient Node<T> first;
    transient Node<T> last;

    
    @Override
    public boolean add(T type) {
        try {
            Node<T> newNode=new Node<T>(type);
            if (sizeLinkedList == 0){
                first = last = newNode;
                sizeLinkedList++;
                return true;
            }else{
                    newNode.prev = last;
                    last.next = newNode;
                    last= newNode;
                    sizeLinkedList++;
                    return true;
                }                
            } 
            catch (ClassCastException e) {
                e.printStackTrace();
            }
            return false;
        }

    public boolean addFirst(T type) {
        try {
            Node<T> newNode=new Node<T>(type);
            if (sizeLinkedList == 0){
                first = last = newNode;
                sizeLinkedList++;
                return true;
            }else{
                    newNode.next = first;
                    first.prev = newNode;
                    first= newNode;
                    sizeLinkedList++;
                    return true;
                }                
            } 
            catch (ClassCastException e) {
                e.printStackTrace();
            }
            return false;
        }

    Node<T> getNode(int index){
        Node<T> indexNode;
        if (index < sizeLinkedList / 2){
            indexNode = first;
            while (index-- > 0)
            indexNode = indexNode.next;
        }else{
            indexNode= last;
            while (++index < sizeLinkedList)
            indexNode = indexNode.prev;
        }
        return indexNode;
    }
    @Override
    public T get(int index) {
        
        return getNode(index).item;
    }

    @Override
    public void remove(int index) {
        try {
            if (sizeLinkedList==1){
                first=last=null;
            }else if (index==0){
                first.next.prev=null;
                first=first.next;
            } else if(index==sizeLinkedList-1){
                last.prev.next=null;
                last=last.prev;
            } else{
                Node<T>removeNode=getNode(index);
                removeNode.prev.next=removeNode.next;
                removeNode.next.prev=removeNode.prev;
            }
            sizeLinkedList--;
        }catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public int size() {
        return sizeLinkedList;
    }

    @Override
    public void update(int index, T type) {
        getNode(index).item=type;        
    }
    @Override
    public Iterator<T> iterator() {
        return new LinkedArrayIterator<>(first);
    }

    public T getFirst()
    {
      if (sizeLinkedList == 0)
        throw new NoSuchElementException();
      return first.item;
    }
 
    public T getLast()
   {
     if (sizeLinkedList == 0)
       throw new NoSuchElementException();
     return last.item;
    }
    
}
