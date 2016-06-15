package be.gerard.example.controller;

import be.gerard.provider.factory.Factory;
import be.gerard.user.shared.v1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RestController
public class ExampleController {

    @Autowired
    private Factory factory;

    @RequestMapping("/")
    public String index() {
        return "Greetings" + factory.get(User::new, 100) + "!";
    }

}
