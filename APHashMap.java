
/**
 * An implementation of a HashMap.
 */
public class APHashMap<K, V>
{
    private Entry<K, V>[] entries;
    private int size;
    
    public APHashMap(int n) {
        entries = new Entry[getNextPrime(n)];
        size = 0;
    }
    
    /**
     * Given a key, returns the corresponding value,
     * or null if there is no entry with that key.
     */
    public V get(K key) {
        int index = hash(key);
        if(entries[index] != null) {
            return entries[index].getValue();
        }
        return null;
    }
    
    /**
     * Adds a new entry to the Map. If key was 
     * already in the map, return the old value.
     * If not, return null.
     */
    public V put(K key, V value) {
        int index = hash(key);
        if(get(key) == null) {
            entries[index] = new Entry(key, value);
            return null;
        }
        else if(entries[index].getKey() != null) {
            V ans = entries[index].getValue();
            entries[index] = new Entry(key, value);
            return ans;
        }
        return null;
    }
    
    /**
     * Removes and returns the value paired with key.
     * If there is no value, do not alter the map, and return null.
     */
    public V remove(K key) {
        int index = hash(key);
        if(entries[index] == null) {
            return null;
        }
        else {
            V ans = entries[index].getValue();
            entries[index] = null;
            return ans;
        }
    }
    
    /**
     * Returns the number of non-null entries in the map.
     * Note this is NOT usually equal to entries.length, because
     * often several of the array elements in entries are null.
     * 
     * You don't need to modify this method. You DO have to make sure
     * that the instance variable size is always correct, as you write
     * the other methods.
     */
    public int size() {
        int count = 0;
        for(int i = 0; i < entries.length; i++) {
            if(entries[i] != null) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Prints something like,
     * key1, value1
     * key2, value2
     * .
     * .
     * .
     * 
     * in the Terminal for each non-null entry
     * in the map. You should skip over null entries.
     */
    public void printMap() {
        for(int i = 0; i < entries.length; i++) {
            if(entries[i] != null) {
                System.out.println(entries[i].getKey() + ", " + entries[i].getValue());
            }
        }
    }
    
    /**
     * Private method -- you DO have to modify this one.
     * This method should return a valid hash index for the given key.
     */
    private int hash(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }
    
    /**
     * Private helper methods used in the constructor.
     * You don't have to modify these.
     */
    private int getNextPrime(int n) {
        while(!isPrime(n)) {
            n++;
        }
        return n;
    }
    
    private boolean isPrime(int n) {
        int factor = 2;
        while(n % factor != 0) {
            factor++;
        }
        return factor == n;
    }
}
