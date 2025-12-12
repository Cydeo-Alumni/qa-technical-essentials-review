package Interview_practices;

import java.util.*;

public class UsersListTask {
    public static void main(String[] args) {
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User(1, "Alice", "alice@example.com", true));
        allUsers.add(new User(2, "Bob", "bob@example.com", false));
        allUsers.add(new User(3, "Charlie", "charlie@example.com", true));
        allUsers.add(new User(4, "Diana", "diana@example.com", true));
        System.out.println(allUsers);

        System.out.println("--Active users--");
        System.out.println(getActiveUsers(allUsers));

        System.out.println("--All emails valid--");
        System.out.println(allEmailsValid(allUsers));

    }

    public static List<User> getActiveUsers(List<User> usersList) {
        List<User> activeUsers = new ArrayList<>();
        for (User each : usersList) {
            if (each.isActive()) {
                activeUsers.add(each);
            }
        }
        return activeUsers;
    }

    public static boolean allEmailsValid(List<User> usersList) {
        for (User each : usersList) {
            if (!each.getEmail().contains("@")) {
                return false;
            }
        }
        return true;
    }
}
