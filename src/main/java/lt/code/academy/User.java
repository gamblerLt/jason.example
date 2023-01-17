package lt.code.academy;

public record User (String name, String surname, int age){

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

/*@JsonIgnoreProperties(ignoreUnknown = true)
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
}*/