package ma.profile.models.implementation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ma.profile.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;


@Document(value = "roles")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Builder(toBuilder = true)
public class Role extends GenericModel {
    private String name;

    @JsonIgnore
    private List<User> users;

    @JsonIgnore
    private List<Privilege> privileges;
}
