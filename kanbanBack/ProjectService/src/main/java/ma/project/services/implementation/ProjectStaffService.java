package ma.project.services.implementation;

import ma.project.models.implementation.ProjectStaff;
import ma.project.repositories.implementation.ProjectStaffRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectStaffService extends GenericService<ProjectStaff> {
    public ProjectStaffService(ProjectStaffRepository projectStaffRepository) {
        super(projectStaffRepository);
    }
}
