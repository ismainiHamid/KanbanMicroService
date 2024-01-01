package ma.project.services.implementation;

import ma.project.models.implementation.ProjectMember;
import ma.project.repositories.implementation.ProjectMemberRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectMemberService extends GenericService<ProjectMember> {
    public ProjectMemberService(ProjectMemberRepository projectMemberRepository) {
        super(projectMemberRepository);
    }
}
