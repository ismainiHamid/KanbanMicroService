package ma.kanban.controller.implementation;

import ma.kanban.controller.GenericController;
import ma.kanban.models.implemenation.Kanban;
import ma.kanban.services.implementation.KanbanService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/kanbans")
@CrossOrigin(origins = "*")
public class KanbanController extends GenericController<Kanban> {
    public KanbanController(KanbanService kanbanService) {
        super(kanbanService);
    }
}
