package homeWork5.homework5_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    // указывает, что все контактные массивы являются атрибутами объекта адресной книги
    Map<String, ArrayList<Object>> contacts = new HashMap<String, ArrayList<Object>>(); 

    // Создаем общую структуру адресной книги: каждая буква соответствует массиву:
    void setContacts() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            // почему имена могут быть одинаковыми
            ArrayList<Object> users = new ArrayList<Object>();
            this.contacts.put(ch + "", users);
        }
    }


    void addUser(User user) {    // добавить пользователя
        // сначала найти ключ
        String firstChar = user.name.substring(0, 1).toUpperCase(); // Удалить первую букву моего имени
        // Сохранить снова: в какую коллекцию сохранить
        ArrayList<Object> userChar = this.contacts.get(firstChar); // группа, соответствующая первой букве
        userChar.add(user.getUserInfo());
    }

}
