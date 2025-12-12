package Interview_practices;

import java.util.*;

public class UsersListTask {

    private User user; //HAS-A relation

    public static void main(String[] args) {
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User(1, "Alice", "alice@example.com", true));
        allUsers.add(new User(2, "Bob", "bob@example.com", false));
        allUsers.add(new User(3, "Charlie", "charlie@example.com", true));
        allUsers.add(new User(4, "Diana", "diana@example.com", false));
        System.out.println(allUsers);

        System.out.println("--Active users--");
        System.out.println(getActiveUsers(allUsers));

        System.out.println("--All emails valid--");
        System.out.println(allEmailsValid(allUsers));

        System.out.println("--Inactive users names");
        System.out.println(getInactiveUserNames(allUsers));

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

    public static List<String> getInactiveUserNames(List<User> usersList) {
        List<String> names = new ArrayList<>();
        for (User user : usersList) {
            if (!user.isActive()) {
                names.add(user.getName());
            }
        }
        return names;
    }
}
