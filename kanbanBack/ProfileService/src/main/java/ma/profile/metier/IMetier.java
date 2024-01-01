package ma.profile.metier;

import ma.profile.utils.IParent;

import java.util.List;

public interface IMetier<S extends IParent> {
    S save(S object);

    S update(S object);

    S delete(S object);

    List<S> findAll();

    S findById(String id);
}
