package ma.project.services;

import lombok.AllArgsConstructor;
import ma.project.metier.IMetier;
import ma.project.repositories.GenericRepository;
import ma.project.utils.IParent;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Transactional
@AllArgsConstructor
public class GenericService<S extends IParent> implements IMetier<S> {
    private GenericRepository<S> genericRepository;

    @Override
    public S save(S object) {
        return (Objects.nonNull(object) ? genericRepository.save(object) : null);
    }

    @Override
    public S update(S object) {
        S result = findById(object.getId());
        assert result != null;
        result.setUpdatedAt(new Date());
        return save(result);
    }

    @Override
    public S delete(String id) {
        S result = findById(id);
        assert result != null;
        result.setDeletedAt(new Date());
        return save(result);
    }

    @Override
    public List<S> findAll() {
        return genericRepository.findAll().stream().filter(a -> a.getDeletedAt() == null).toList();
    }

    @Override
    public S findById(String id) {
        return genericRepository.findById(id).stream().filter(a -> a.getDeletedAt() == null).findFirst().orElse(null);
    }
}
