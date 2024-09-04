import java.util.Arrays;
import java.util.Iterator;

public class HashTable <K, V> implements Iterable<HashTable.Entry<K,V>>{
    private Entry<K, V>[] table;
    private int size;

    public static class Entry<K, V> {
        final K key;
        V value;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(){
        this.table = new Entry[16];
    }

    public int hashFunction(K key){
        return key.hashCode() % table.length;
    }
    
    public void put(K key, V value){
        int index = Math.abs(this.hashFunction(key));
        Entry<K, V> newEntry = new Entry<K,V>(key, value);

        if(this.table[index] == null){
            this.table[index] = newEntry;

            this.size++;
        } else{
            this.table[index].value = value;
        }
    }

    public V get(K key){
        int index = Math.abs(this.hashFunction(key));
        return this.table[index].value;
    }

    @Override
    public Iterator<Entry<K,V>> iterator(){
        return Arrays.stream(this.table).iterator();
    }
}
