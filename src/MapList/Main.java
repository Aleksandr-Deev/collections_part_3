package MapList;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "test5");
        orderedMap.put(6, "test6");
        orderedMap.put(1, "test1");
        orderedMap.put(3, "test3");
        orderedMap.put(7, "test7");
        orderedMap.put(2, "test2");
        orderedMap.put(8, "test8");
        orderedMap.put(4, "test4");
        orderedMap.put(9, "test9");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }
    }

}
