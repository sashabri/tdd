package phone_book;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, Integer> nameToNumber = new TreeMap<>();
    private Map<Integer,String> numberToName = new HashMap<>();

    public int add(String name, int number) {

        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name,number);
            numberToName.put(number, name);
        }

        return nameToNumber.size();
    }

    public String findByNumber(int number) {
        return numberToName.get(number);
    }

    public int findByName(String name) {
        return 0;
    }
}
