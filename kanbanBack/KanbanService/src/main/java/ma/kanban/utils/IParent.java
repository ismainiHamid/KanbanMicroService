package ma.kanban.utils;

import java.util.Date;

public interface IParent {
    String getId();

    void setId(String id);

    Date getDeletedAt();

    void setDeletedAt(Date deletedAt);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);
}
