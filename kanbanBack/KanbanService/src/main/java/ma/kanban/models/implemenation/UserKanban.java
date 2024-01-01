package ma.kanban.models.implemenation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.kanban.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "users_kanbans")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Builder(toBuilder = true)
public class UserKanban extends GenericModel {
    @NotNull
    private String userId;

    @NotNull
    private String type;

    @JsonIgnore
    private Kanban kanban;

    @JsonIgnore
    private Task task;
}
