package phone_book;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, Integer> forPrintName = new TreeMap<>();
    private Map<Integer,String> forFindName = new HashMap<>();

    public int add(String name, int number, Map<String, Integer> map) {

        if (!map.containsKey(name)) {
            map.put(name, number);
            forPrintName.put(name,number);
            forFindName.put(number, name);
        }

        return map.size();
    }

    public String findByNumber(int number) {
        return forFindName.get(number);
    }
}
