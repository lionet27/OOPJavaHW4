package gb.list;

import java.util.Iterator;
import java.util.NoSuchElementException;
import gb.GBList;

public class GBArrayList<T> implements GBList<T> {
    private T[] values;
    private static final int DefaultCapaity=10;
    private int sizeArrayList=0;

    public GBArrayList() {
        this.values = (T[]) new Object[DefaultCapaity];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public boolean add(T type) {
        try {
              if (sizeArrayList==values.length){
                    T[] temp = values;
                    values = (T[]) new Object[temp.length + temp.length/2];
                    System.arraycopy(temp, 0, values, 0, temp.length);
                    values[sizeArrayList] = type;
                    sizeArrayList+=1;
                    return true;
              }else{
                    values[sizeArrayList] = type;
                    sizeArrayList+=1;
                    return true;
              }   

            
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountAfterIndex);
           
            sizeArrayList-=1;
            
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T get(int index) {
        if (index >(sizeArrayList-1))
            throw new NoSuchElementException();
        return values[index];
    }

    @Override
    public int size() {
        return sizeArrayList;
    }

    @Override
    public void update(int index, T type) {
        values[index] = type;
    }

}
