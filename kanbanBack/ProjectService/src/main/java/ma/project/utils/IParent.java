package ma.project.utils;

import java.util.Date;

public interface IParent {
    String getId();

    void setId(String id);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Date getDeletedAt();

    void setDeletedAt(Date deletedAt);
}
