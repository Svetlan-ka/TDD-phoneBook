import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void add_ReturnNumberContacts() {
        //подготавливаем данные
         int expected = 1;
        //вызываем целевой метод
        int count = PhoneBook.add("Sveta", 645248);
        //производим проверку
        assertThat(expected, equalTo(count));
    }

    @Test
    public void findByNumber_ReturnNameContact() {
        //подготавливаем данные
        String expectedName = "Sveta";
        //вызываем целевой метод
        PhoneBook.add("Sveta", 645248);
        String name = PhoneBook.findByNumber(645248);
        //производим проверку
        assertEquals(expectedName, name);
    }

    @Test
    public void findByNumber_ReturnNull() {
        //вызываем целевой метод
        PhoneBook.add("Sveta", 645248);
        String name = PhoneBook.findByNumber(645148);
        //производим проверку
        assertThat(name, is(nullValue()));
    }





}
