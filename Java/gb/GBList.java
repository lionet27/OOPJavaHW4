package gb;

public interface GBList<T> extends Iterable<T> {
    boolean add(T type);
    void remove(int index);
    T get(int index);
    int size();
    void update(int index, T type); 
}
