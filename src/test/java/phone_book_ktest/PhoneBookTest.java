package phone_book_ktest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import phone_book.PhoneBook;


public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        int expected1 = 1;

        Assertions.assertEquals(expected1, phoneBook.add("Anya", 123569));

        int expected2 = 2;

        Assertions.assertEquals(expected2, phoneBook.add("Alis", 456879));

        Assertions.assertEquals(expected2, phoneBook.add("Alis", 354682));
    }

    @Test
    public void testFindByNumber() {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anya", 123569);
        phoneBook.add("Alis", 456879);

        String expected = "Anya";
        int controlNumber = 123569;

        String actualName = phoneBook.findByNumber(controlNumber);

        Assertions.assertEquals(expected, actualName);
    }

    @Test
    public void testFindByName() {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anya", 123569);
        phoneBook.add("Alis", 456879);

        String controlName  = "Anya";
        int expected = 123569;

        int actualNumber = phoneBook.findByName(controlName);

        Assertions.assertEquals(expected, actualNumber);
    }
}
