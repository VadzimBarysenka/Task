import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        final List<User> users = Arrays.asList(new User("eugen", "000000"), new User("vadim", "qwe123!"),
                new User("arthur", "jh23df"), new User("alex", "78239$"),
                new User("dmitry", "899sydu8"));

        ArrayList<String> pas = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        users.forEach((User) -> {
            if (User.getUsername().startsWith("a")) {
                users.add(User);
            }
        });

        users.forEach((User) -> {
            if (User.getUsername().startsWith("a")) {
                names.add(User.getUsername());
            }
        });

        users.forEach((User) -> {
            if (!User.getUsername().startsWith("a")) {
                pas.add(User.getPassword());
            }
        });
        //1. save users (User class) in collection with name starting with letter 'a'
        //2. save names (String class) in collection with name starting with letter 'a'
        //3. save passwords (String class) in collection with name not starting with letter 'a'
        //4. save users (User class) in collection with correct password. Correct password - alphanumeric and more than 6 signs
    }
}
