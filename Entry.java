/**
 * A class that describes an Entry object in a Map.
 */

public class Entry<K, V>
{
    private K key;
    private V value;
    
    public Entry(K k, V v) {
        key = k;
        value = v;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
}
