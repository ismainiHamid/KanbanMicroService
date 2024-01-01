package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.ProjectManager;
import ma.project.services.implementation.ProjectManagerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/project-managers")
@CrossOrigin(origins = "*")
public class ProjectManagerController extends GenericController<ProjectManager> {
    public ProjectManagerController(ProjectManagerService projectManagerService) {
        super(projectManagerService);
    }
}
