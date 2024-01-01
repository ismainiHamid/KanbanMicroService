package ma.project.models.implementation;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "team-leaders")
public class TeamLeader extends ProjectStaff {
}
