package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.util.List;

public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Николай", "Котов", (byte) 29);
        userService.saveUser("Сергей", "Скоков", (byte) 35);
        userService.saveUser("Семен", "Токов", (byte) 17);

        userService.removeUserById(3);

        List<User> strings = userService.getAllUsers();
        for (User s : strings)
            System.out.println(s.toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
