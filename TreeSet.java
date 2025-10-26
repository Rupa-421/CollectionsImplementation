import java.io.Serializable;
import java.util.*;

public class TreeSet<E> extends AbstractSet<E>
        implements Serializable, Cloneable {
    private transient NavigableMap<E,Object> m;
    private static final Object PRESENT = new Object();
    public TreeSet(){
        this.m = new TreeMap<>();
    }

    public TreeSet(Comparator<? super E> comparator){
        this.m = new TreeMap<>(comparator);
    }

    public boolean add(E e){
        return m.put(e, PRESENT) == null;
    }

    public boolean remove(Object o){
        return m.remove(o) == PRESENT;
    }

    public Iterator<E> iterator(){
        return m.navigableKeySet().iterator();
    }

    public int size(){
        return m.size();
    }

    public void clear(){
        m.clear();
    }

    public E first(){
        return m.firstKey();
    }

    public E last(){
        return m.lastKey();
    }

    public static void main(String[] args){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(5);
        ts.add(2);
        System.out.println(ts.last());
    }


}
