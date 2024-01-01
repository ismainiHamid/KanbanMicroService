package ma.project.services.implementation;

import ma.project.models.implementation.TeamLeader;
import ma.project.repositories.implementation.TeamLeaderRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeamLeaderService extends GenericService<TeamLeader> {
    public TeamLeaderService(TeamLeaderRepository teamLeaderRepository){
        super(teamLeaderRepository);
    }
}
