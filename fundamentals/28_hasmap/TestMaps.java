import java.util.HashMap;
import java.util.Map;


public class ImplementationMaps<K, V> implements Map<K, V> {

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }

    public void clear() {
    }
    
    public static void main(String[]args){
    
      ImplementationMaps getName = new ImplementationMaps();
    }
}

