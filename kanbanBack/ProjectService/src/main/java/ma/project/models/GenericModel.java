package ma.project.models;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import ma.project.utils.IParent;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class GenericModel implements Serializable, IParent {
    @Id
    private String id;

    @NotNull
    private Date createdAt = new Date();

    @Nullable
    private Date updatedAt = null;

    @Nullable
    private Date deletedAt = null;
}
