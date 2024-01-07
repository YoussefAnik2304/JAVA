import messages.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {
            MessageApp messageApp = new MessageApp();

            User user1 = new User("Alice");
            User user2 = new User("Bob");
            User user3 = new User("Charlie");

            messageApp.register("java", user1);
            messageApp.register("java", user2);
            messageApp.register("python", user2);
            messageApp.register("python", user3);

            System.out.println("Users registered for 'java': " + messageApp.registeredUsersForTag("java"));
            System.out.println("All tags: " + messageApp.allTags());
            System.out.println("All users: " + messageApp.allUsers());

            messageApp.unregisterForTag("java", user1);
            messageApp.unregisterFromAll(user2);

            System.out.println("Users registered for 'java': " + messageApp.registeredUsersForTag("java"));
            System.out.println("All users: " + messageApp.allUsers());
        } catch (AlreadyRegisteredUserException e) {
            e.printStackTrace();
        }
    }
}
