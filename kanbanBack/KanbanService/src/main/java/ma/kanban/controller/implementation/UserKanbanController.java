package ma.kanban.controller.implementation;

import ma.kanban.controller.GenericController;
import ma.kanban.models.implemenation.UserKanban;
import ma.kanban.services.implementation.UserKanbanService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user-kanban")
@CrossOrigin(origins = "*")
public class UserKanbanController extends GenericController<UserKanban> {
    public UserKanbanController(UserKanbanService userKanbanService) {
        super(userKanbanService);
    }
}
