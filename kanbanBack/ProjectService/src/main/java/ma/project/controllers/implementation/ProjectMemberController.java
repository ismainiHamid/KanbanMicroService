package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.ProjectMember;
import ma.project.services.implementation.ProjectMemberService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/project-members")
@CrossOrigin(origins = "*")
public class ProjectMemberController extends GenericController<ProjectMember> {
    public ProjectMemberController(ProjectMemberService projectMemberService) {
        super(projectMemberService);
    }
}
