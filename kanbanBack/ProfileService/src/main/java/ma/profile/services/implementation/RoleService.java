package ma.profile.services.implementation;

import ma.profile.Repositories.implementation.RoleRepository;
import ma.profile.models.implementation.Role;
import ma.profile.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleService extends GenericService<Role> {
    public RoleService(RoleRepository roleRepository) {
        super(roleRepository);
    }
}
