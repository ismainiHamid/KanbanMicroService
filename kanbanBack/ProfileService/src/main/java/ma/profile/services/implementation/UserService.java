package ma.profile.services.implementation;

import ma.profile.Repositories.implementation.UserRepository;
import ma.profile.models.implementation.User;
import ma.profile.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService extends GenericService<User> {
    public UserService(UserRepository userRepository) {
        super(userRepository);
    }
}
