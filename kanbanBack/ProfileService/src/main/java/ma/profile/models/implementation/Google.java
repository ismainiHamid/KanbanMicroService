package ma.profile.models.implementation;

import lombok.*;
import ma.profile.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "google")
@NoArgsConstructor(force = true)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Google extends GenericModel {

}
