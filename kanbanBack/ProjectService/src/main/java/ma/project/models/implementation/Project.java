package ma.project.models.implementation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.*;
import ma.project.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "projects")
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Project extends GenericModel {
    @NotNull
    private String name;

    @NotNull
    private Double cost;

    @NotNull
    private Date startDate;

    @Null
    private Client client;
}
