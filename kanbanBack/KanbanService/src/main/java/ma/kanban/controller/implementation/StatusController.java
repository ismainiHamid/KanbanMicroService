package ma.kanban.controller.implementation;

import ma.kanban.controller.GenericController;
import ma.kanban.models.implemenation.Status;
import ma.kanban.services.implementation.StatusService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/status")
@CrossOrigin(origins = "*")
public class StatusController extends GenericController<Status> {
    public StatusController(StatusService statusService) {
        super(statusService);
    }
}
