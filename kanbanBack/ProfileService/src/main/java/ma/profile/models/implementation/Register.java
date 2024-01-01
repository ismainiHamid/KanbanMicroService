package ma.profile.models.implementation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ma.profile.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(value = "registers")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Register extends GenericModel {
    protected String username;

    protected String password;

    @JsonIgnore
    protected List<User> users;
}
