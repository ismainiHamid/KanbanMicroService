package ma.profile.controllers.implementation;

import ma.profile.controllers.GenericController;
import ma.profile.models.implementation.User;
import ma.profile.services.implementation.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController extends GenericController<User> {
    public UserController(UserService userService) {
        super(userService);
    }
}
