import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PhoneBookTest {

    @Test
    public void addReturnNumberContacts() {
        //подготавливаем данные
         int expected = 1;
        //вызываем целевой метод
        int count = PhoneBook.add();
        //производим проверку
        assertThat(expected, equalTo(count));
    }



}
