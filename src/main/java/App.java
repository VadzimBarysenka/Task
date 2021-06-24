import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        final List<User> users = Arrays.asList(new User("eugen", "000000"), new User("vadim", "qwe123!"),
                new User("arthur", "jh23df"), new User("alex", "78239$"),
                new User("dmitry", "899sydu8"));

        // 1. save users (User class) in collection with name starting with letter 'a'
        List<User> sortusesrs = users.stream().filter(user -> user.getUsername().startsWith("a"))
                .collect(Collectors.toList());


        //2. save names (String class) in collection with name starting with letter 'a'
        ArrayList<String> names = (ArrayList<String>) users.stream().map(User::getUsername)
                .filter(username -> username.startsWith("a"))
                .collect(Collectors.toList());


        //3. save passwords (String class) in collection with name not starting with letter 'a'
        ArrayList<String> passwords = (ArrayList<String>) users.stream().filter(user -> !user.getUsername().startsWith("a"))
                .map(User::getPassword)
                .collect(Collectors.toList());


        //4. save users (User class) in collection with correct password. Correct password - alphanumeric and more than 6 signs
        List<User> correctpasswords = users.stream().filter(user -> user.getPassword().chars().allMatch(Character::isLetterOrDigit) && user.getPassword().length() > 6)
                .collect(Collectors.toList());




       final List<List<User>> users2 = Arrays.asList(Arrays.asList(new User("eugen", "000000"), new User("vadim", "qwe123!")),
                Arrays.asList(new User("arthur", "jh23df"), new User("alex", "78239$"), new User("dmitry", "899sydu8")));

        // 1. save users (User class) in collection with name starting with letter 'a'
        List<User> sortusesrs2 = users2.stream()
                .flatMap(Collection::stream)
                .filter(user -> user.getUsername().startsWith("a"))
                .collect(Collectors.toList());

        //2. save names (String class) in collection with name starting with letter 'a'
        ArrayList<String> names2 = (ArrayList<String>) users2.stream()
                .flatMap(Collection::stream)
                .map(User::getUsername)
                .filter(username -> username.startsWith("a"))
                .collect(Collectors.toList());

        //3. save passwords (String class) in collection with name not starting with letter 'a'
        ArrayList<String> passwords2 = (ArrayList<String>) users2.stream()
                .flatMap(Collection::stream)
                .filter(user -> !user.getUsername().startsWith("a"))
                .map(User::getPassword)
                .collect(Collectors.toList());



        //4. save users (User class) in collection with correct password. Correct password - alphanumeric and more than 6 signs
        List<User> correctpasswords2 = users2.stream()
                .flatMap(Collection::stream)
                .filter(user -> user.getPassword().chars()
                .allMatch(Character::isLetterOrDigit) && user.getPassword().length() > 6)
                .collect(Collectors.toList());
    }
}
