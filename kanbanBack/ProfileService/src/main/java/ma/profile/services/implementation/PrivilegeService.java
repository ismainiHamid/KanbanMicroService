package ma.profile.services.implementation;

import ma.profile.Repositories.implementation.PrivilegeRepository;
import ma.profile.models.implementation.Privilege;
import ma.profile.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PrivilegeService extends GenericService<Privilege> {
    public PrivilegeService(PrivilegeRepository privilegeRepository) {
        super(privilegeRepository);
    }
}
