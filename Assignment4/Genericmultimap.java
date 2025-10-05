package Assignment4;

import java.util.*;

class MultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    List<V> get(K key) {
        return map.getOrDefault(key, Collections.emptyList());
    }

    public String toString() {
        return map.toString();
    }
}

public class MultiMapDemo {
    public static void main(String[] args) {
        MultiMap<String, String> multiMap = new MultiMap<>();
        multiMap.put("Fruit", "Apple");
        multiMap.put("Fruit", "Banana");
        multiMap.put("Color", "Red");

        System.out.println(multiMap);
    }
}



