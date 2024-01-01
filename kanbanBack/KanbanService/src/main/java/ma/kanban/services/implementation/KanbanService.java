package ma.kanban.services.implementation;

import ma.kanban.models.implemenation.Kanban;
import ma.kanban.repositories.implemenation.KanbanRepository;
import ma.kanban.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KanbanService extends GenericService<Kanban> {
    public KanbanService(KanbanRepository kanbanRepository) {
        super(kanbanRepository);
    }
}
