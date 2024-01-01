package ma.profile.models.implementation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ma.profile.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(value = "users")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class User extends GenericModel {
    private String fullName;

    private String phoneNumber;

    private String username;

    private String password;

    private boolean isValid = false;

    @JsonIgnore
    private List<Role> roles;
}
