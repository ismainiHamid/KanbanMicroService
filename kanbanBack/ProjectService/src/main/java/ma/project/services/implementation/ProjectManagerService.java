package ma.project.services.implementation;

import ma.project.models.implementation.ProjectManager;
import ma.project.repositories.implementation.ProjectManagerRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectManagerService extends GenericService<ProjectManager> {
    public ProjectManagerService(ProjectManagerRepository projectManagerRepository) {
        super(projectManagerRepository);
    }
}
