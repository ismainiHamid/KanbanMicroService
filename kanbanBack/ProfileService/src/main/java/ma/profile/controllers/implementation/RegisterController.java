package ma.profile.controllers.implementation;

import ma.profile.controllers.GenericController;
import ma.profile.models.implementation.Register;
import ma.profile.services.implementation.RegisterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/registers")
@CrossOrigin(origins = "*")
public class RegisterController extends GenericController<Register> {
    public RegisterController(RegisterService registerService) {
        super(registerService);
    }
}
