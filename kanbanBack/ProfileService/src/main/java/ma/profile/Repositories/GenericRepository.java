package ma.profile.Repositories;

import ma.profile.utils.IParent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenericRepository<S extends IParent> extends MongoRepository<S, String> {
}
