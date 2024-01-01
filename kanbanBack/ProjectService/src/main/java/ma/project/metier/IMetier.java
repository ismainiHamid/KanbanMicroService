package ma.project.metier;

import ma.project.utils.IParent;

import java.util.List;

public interface IMetier<S extends IParent> {
    S save(S object);

    S update(S object);

    S delete(String id);

    List<S> findAll();

    S findById(String id);
}
