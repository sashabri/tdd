package phone_book;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    public int add(String name, int number, Map<String, Integer> map) {

        if (!map.containsKey(name)) {
            map.put(name, number);
        }

        return map.size();
    }
}
