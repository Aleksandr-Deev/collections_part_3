package mapCollection;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    private Map<String, Integer> map = new HashMap<>();

    public void addMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueMap = map.get(key);
            if (valueMap == value) {
                throw new IllegalArgumentException();
            } else {
                map.put(key, valueMap + value);
            }
        }
    }
}
