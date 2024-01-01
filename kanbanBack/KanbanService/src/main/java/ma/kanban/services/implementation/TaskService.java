package ma.kanban.services.implementation;

import ma.kanban.models.implemenation.Task;
import ma.kanban.repositories.implemenation.TaskRepository;
import ma.kanban.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskService extends GenericService<Task> {
    public TaskService(TaskRepository taskRepository) {
        super(taskRepository);
    }
}
