import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static String phoneBook(String value) {

        Map<String, String> hashMap = new HashMap<String, String>();
        ArrayList<String> phoneArray = new ArrayList<String>();


        phoneArray.add("+8 800 2000 500 \n+8 800 200 600");
        phoneArray.add("+8 800 2000 700");//Петров
        phoneArray.add("+8 800 2000 800 \n+8 800 2000 900 \n+8 800 2000 000");

        hashMap.put("Иванов И.И.", phoneArray.get(0));
        hashMap.put("Петров П.П.", phoneArray.get(1));
        hashMap.put("Сидоров С.С.", phoneArray.get(2));
        if (!(hashMap.get(value) == null)) {
            return hashMap.get(value);
        } else {
            System.out.println("Нет такой фамилии в телефоннной книге");
            return null;
        }
    }

    public static void print(String str){
        System.out.println(str);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ф.И.О:");
        String value = scanner.nextLine();
        print(phoneBook(value));

    }





}
