package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.TeamLeader;
import ma.project.services.implementation.TeamLeaderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/team-leaders")
@CrossOrigin(origins = "*")
public class TeamLeaderController extends GenericController<TeamLeader> {
    public TeamLeaderController(TeamLeaderService teamLeaderService) {
        super(teamLeaderService);
    }
}
