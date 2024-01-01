package ma.project.controllers;

import jakarta.ws.rs.core.MediaType;
import ma.project.controllers.implementation.ClientController;
import ma.project.models.implementation.Client;
import ma.project.services.implementation.ClientService;
import org.bson.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;

import static org.springframework.data.mongodb.core.validation.Validator.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(ClientController.class)
public class ClientControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private ClientService clientService;

    @Test
    public void contextLoads() throws Exception {
        Client client = this.clientService.findById("658d809fb658126a3173ff7c");
        assertThat(client.getName()).isEqualTo(("AWT"));
    }

    @Test
    public void listClients() throws Exception {
        this.mvc.perform(get("/clients").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andDo((ResultHandler) document(Document.parse("list-clients")));
    }
}
