package ma.profile.controllers.implementation;

import ma.profile.controllers.GenericController;
import ma.profile.models.implementation.Privilege;
import ma.profile.services.implementation.PrivilegeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/privileges")
@CrossOrigin(origins = "*")
public class PrivilegeController extends GenericController<Privilege> {
    public PrivilegeController(PrivilegeService privilegeService) {
        super(privilegeService);
    }
}
