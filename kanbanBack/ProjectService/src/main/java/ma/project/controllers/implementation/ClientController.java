package ma.project.controllers.implementation;

import ma.project.controllers.GenericController;
import ma.project.models.implementation.Client;
import ma.project.services.implementation.ClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clients")
@CrossOrigin(origins = "*")
public class ClientController extends GenericController<Client> {
    public ClientController(ClientService clientService) {
        super(clientService);
    }
}
