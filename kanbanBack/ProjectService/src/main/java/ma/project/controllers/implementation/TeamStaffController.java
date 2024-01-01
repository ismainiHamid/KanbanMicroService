package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.TeamStaff;
import ma.project.services.implementation.TeamStaffService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/team-staff")
@CrossOrigin(origins = "*")
public class TeamStaffController extends GenericController<TeamStaff> {
    public TeamStaffController(TeamStaffService teamStaffService) {
        super(teamStaffService);
    }
}
