package ma.profile.controllers.implementation;

import ma.profile.controllers.GenericController;
import ma.profile.models.implementation.Role;
import ma.profile.services.implementation.RoleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/roles")
@CrossOrigin(origins = "*")
public class RoleController extends GenericController<Role> {
    public RoleController(RoleService roleService) {
        super(roleService);
    }
}
