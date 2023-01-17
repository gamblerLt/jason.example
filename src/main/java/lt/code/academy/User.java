package lt.code.academy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    record User(
            @JsonProperty("netikrasVardas")
            String name,
            @JsonProperty("kitaPavarde")
            String surname,
            String email,
            int age) {

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }