package ma.profile.services.implementation;

import ma.profile.Repositories.implementation.RegisterRepository;
import ma.profile.models.implementation.Register;
import ma.profile.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegisterService extends GenericService<Register> {
    public RegisterService(RegisterRepository registerRepository) {
        super(registerRepository);
    }
}
