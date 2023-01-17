/*
package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class MainCustomSerializer {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(User.class, new UserSerializer());

        objectMapper.registerModule(module);

        User user = new User("Rimas", "Pavarde", 15);
      String json = objectMapper.writeValueAsString(user);

       System.out.println(json);
    }
}
*/
