package ma.kanban.models;


import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.kanban.utils.IParent;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public abstract class GenericModel implements Serializable, IParent {
    @Id
    private String id;

    @NotNull
    private Date createdAt = new Date();

    @Nullable
    private Date updatedAt = null;

    @Nullable
    private Date deletedAt = null;
}
