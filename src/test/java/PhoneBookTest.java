import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)

public class PhoneBookTest {

   private String value;

    public PhoneBookTest(String value) {
        this.value = value;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data (){
        Object[][] data = {{"Иванов И.И."},
                {"Сидоров С.С."},
                {"Петров П.П."},
                {"Таранцев Т.Т"},
                {"Георгиев Г.Г"}};
       return Arrays.asList(data);
    }

    @org.junit.Test
    public void phoneBookTest() {
       String str = PhoneBook.phoneBook( value);
        PhoneBook.print(str);



    }

    
}