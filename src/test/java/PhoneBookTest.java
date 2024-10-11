import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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
        String name = PhoneBook.findByNumber(645248);
        //производим проверку
        assertThat(name, equals(expectedName));
    }

    @Test
    public void findByNumber_ReturnNull() {
        //подготавливаем данные
        String expectedName = null;
        //вызываем целевой метод
        String name = PhoneBook.findByNumber(645148);
        //производим проверку
        assertThat(name, equals(expectedName));
    }





}
