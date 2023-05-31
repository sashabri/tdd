package phone_book_ktest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import phone_book.PhoneBook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        Map<String, Integer> result = new TreeMap<>();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anya", 123569, result);

        Assertions.assertEquals(result.keySet().size(), 1);

        phoneBook.add("Alis", 456879, result);

        Assertions.assertEquals(result.keySet().size(), 2);

        phoneBook.add("Alis", 354682, result);

        Assertions.assertEquals(result.keySet().size(), 2);
    }

    @Test
    public void testFindByNumber() {
        Map<String, Integer> testListContacts = new TreeMap<>();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anya", 123569, testListContacts);
        phoneBook.add("Alis", 456879, testListContacts);

        String actualName = "Anya";
        int controlNumber = 123569;

        String expected = phoneBook.findByNumber(controlNumber);

        Assertions.assertEquals(expected, actualName);
    }
}
