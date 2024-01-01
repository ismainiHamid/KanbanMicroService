package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.Project;
import ma.project.services.implementation.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/projects")
@CrossOrigin(origins = "*")
public class ProjectController extends GenericController<Project> {
    public ProjectController(ProjectService projectService) {
        super(projectService);
    }
}
