package ma.project.models.implementation;

import ma.project.models.GenericModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "project-members")
public class ProjectMember extends GenericModel {
}
