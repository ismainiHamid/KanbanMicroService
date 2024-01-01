package ma.kanban.models.implemenation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.kanban.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "kanbans")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Builder(toBuilder = true)
public class Kanban extends GenericModel {
    @NotNull
    private String name;

    @JsonIgnore
    private List<UserKanban> userKanbans;

    @JsonIgnore
    private List<Status> statuses;
}
