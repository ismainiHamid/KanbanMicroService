package ma.kanban.repositories;

import ma.kanban.utils.IParent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenericRepository<S extends IParent> extends MongoRepository<S, String> {
}
