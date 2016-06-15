package be.gerard.user.controller;

import be.gerard.provider.factory.Factory;
import be.gerard.user.shared.v1.UserService;
import be.gerard.user.shared.v1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserRestController
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RestController
public class UserRestController {

    @Autowired
    private Factory factory;

    @Autowired
    private UserService userService;

    @RequestMapping("/users/load")
    public String load() {
        for (User user : factory.get(User::new, 100)) {
            userService.save(user);
        }
        return "DONE";
    }

    @RequestMapping("/users/greets")
    public String index() {
        return "Greetings" + factory.get(User::new, 100) + "!";
    }

    @RequestMapping("/users/{id}")
    public User findOne(@PathVariable("id") long id) {
        return userService.findOne(id);
    }

}
