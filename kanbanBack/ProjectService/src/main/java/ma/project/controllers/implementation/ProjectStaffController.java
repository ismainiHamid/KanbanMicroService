package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.ProjectStaff;
import ma.project.services.implementation.ProjectStaffService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/project-staffs")
@CrossOrigin(origins = "*")
public class ProjectStaffController extends GenericController<ProjectStaff> {
    public ProjectStaffController(ProjectStaffService projectStaffService) {
        super(projectStaffService);
    }
}
