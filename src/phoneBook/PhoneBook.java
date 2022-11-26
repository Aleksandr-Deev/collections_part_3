package phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private final Map <String, String> book = new HashMap<>();

    public void addPhone(String fullName, String phone) {
        book.put(fullName, phone);
    }

    public Set<Map.Entry<String, String>> getPrint() {
        return book.entrySet();
    }
}
