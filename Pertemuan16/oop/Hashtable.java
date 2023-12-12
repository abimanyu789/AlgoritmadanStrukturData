package Praktikum.Pertemuan16.oop;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class Hashtable<K, V> {
    private final Map<K, V> map;

    public Hashtable() {
        map = new HashMap<>();
    } 
    public int size () {
        return map.size();
    } 
    public boolean isEmpty() { 
        return map.isEmpty();
    }
    public V put (K key, V value) {
        return map.put (key, value);
    } 
    public V get (K key) { 
        return map.get(key);
    }
    public V remove (K key) { 
        return map.remove(key);
    }
    public boolean containsKey (K key) { 
        return map.containsKey(key);
    }
    
    // Additional methods specific to Hashtable
    public void putAll (Map<? extends K, ? extends V> m) {
        map.putAll (m);
    }
    public void clear() {
        map.clear();
    }
    public Set<K> keySet(){
        return map.keySet();
    }
    public Collection<V> values () { 
        return map.values();
    }
    public Set<Map.Entry<K, V>> entrySet () { 
        return map.entrySet();
    }
    // Implement any custom methods specific to your use case
}
