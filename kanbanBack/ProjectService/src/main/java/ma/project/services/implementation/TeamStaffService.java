package ma.project.services.implementation;

import ma.project.models.implementation.TeamStaff;
import ma.project.repositories.implementation.TeamStaffRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamStaffService extends GenericService<TeamStaff> {
    public TeamStaffService(TeamStaffRepository teamStaffRepository) {
        super(teamStaffRepository);
    }
}
