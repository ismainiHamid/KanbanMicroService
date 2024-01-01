package ma.project.services.implementation;

import ma.project.models.implementation.Project;
import ma.project.repositories.implementation.ProjectRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService extends GenericService<Project> {
    public ProjectService(ProjectRepository projectRepository) {
        super(projectRepository);
    }
}
