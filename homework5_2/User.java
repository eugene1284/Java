package homework5_2;

import java.util.HashMap;
import java.util.Map;

public class User {

    String name;
    String phone;
    String address;

    // Поместить информацию о человеке в словарь
    Map<String, String> getUserInfo() {
        Map<String, String> userInfo = new HashMap<String, String>();
        userInfo.put("name", this.name);
        userInfo.put("phone", this.phone);
        userInfo.put("address", this.address);
        return userInfo;
    }
}
