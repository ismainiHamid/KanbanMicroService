package ma.kanban.models.implemenation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.kanban.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "statuses")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Builder(toBuilder = true)
public class Status extends GenericModel {
    @NotNull
    private String name;

    @NotNull
    private Long order;

    @JsonIgnore
    private Kanban kanban;
}
