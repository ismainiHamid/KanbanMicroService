package ma.kanban.services.implementation;

import ma.kanban.models.implemenation.Status;
import ma.kanban.repositories.implemenation.StatusRepository;
import ma.kanban.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StatusService extends GenericService<Status> {
    public StatusService(StatusRepository statusRepository) {
        super(statusRepository);
    }
}
