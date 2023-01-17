package lt.code.academy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT); // atvaizduos graziau

        User user = new User("Rimas", "Spakauskas", 45);
        User secondUser = new User("Petras", "Pethshyts", 54);

        File file = new File("users.json");
        if(!file.exists()) {

            //write object tofile
            file.createNewFile();
        }
        mapper.writeValue(file, user);

        //nuskaitom objekta atgal - read object from file

        User readValue = mapper.readValue(file, User.class);
        System.out.println(readValue);

        //string to object
        String stringUser = mapper.writeValueAsString(secondUser);
        System.out.println(stringUser);

        //string tp object
        User objectUser = mapper.readValue(stringUser, User.class);
        System.out.println(objectUser);

        //write objects to jason file
        mapper.writeValue(file, List.of(user, secondUser, objectUser));

        //read object from file 17 d 19 valanda vid ndndndndndndndn
       List<User>users = mapper.readValue(file, new TypeReference<>() {
        });
        System.out.println(users);



    }
}