package ma.project.services.implementation;

import ma.project.models.implementation.Client;
import ma.project.repositories.implementation.ClientRepository;
import ma.project.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService extends GenericService<Client> {
    public ClientService(ClientRepository clientRepository) {
        super(clientRepository);
    }
}
