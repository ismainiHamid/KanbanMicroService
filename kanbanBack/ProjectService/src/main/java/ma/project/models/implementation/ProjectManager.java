package ma.project.models.implementation;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "project-managers")
public class ProjectManager extends ProjectMember {
}
