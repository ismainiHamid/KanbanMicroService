package ma.kanban.controller.implementation;

import ma.kanban.controller.GenericController;
import ma.kanban.models.implemenation.Task;
import ma.kanban.services.implementation.TaskService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tasks")
@CrossOrigin(origins = "*")
public class TaskController extends GenericController<Task> {
    public TaskController(TaskService taskService) {
        super(taskService);
    }
}
