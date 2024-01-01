package ma.kanban.services.implementation;

import ma.kanban.models.implemenation.UserKanban;
import ma.kanban.repositories.implemenation.UserKanbanRepository;
import ma.kanban.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserKanbanService extends GenericService<UserKanban> {
    public UserKanbanService(UserKanbanRepository userKanbanRepository) {
        super(userKanbanRepository);
    }
}
