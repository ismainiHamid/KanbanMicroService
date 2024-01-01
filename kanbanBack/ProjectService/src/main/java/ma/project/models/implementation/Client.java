package ma.project.models.implementation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.project.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Client extends GenericModel {
    @NotNull
    private String name;

    @NotNull
    private String country;

    @NotNull
    private Double budget;

    @JsonIgnore
    private List<Project> projects;
}
