package ma.profile.models.implementation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ma.profile.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(value = "privileges")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Privilege extends GenericModel {
    private String name;

    @JsonIgnore
    private List<Role> roles;
}
