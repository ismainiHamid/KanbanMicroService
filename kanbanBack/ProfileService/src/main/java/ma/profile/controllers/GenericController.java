package ma.profile.controllers;

import lombok.AllArgsConstructor;
import ma.profile.services.GenericService;
import ma.profile.utils.IParent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public abstract class GenericController<S extends IParent> {
    private GenericService<S> genericService;

    @PostMapping
    public S save(@RequestBody S object) {
        return genericService.save(object);
    }

    @PutMapping
    public S update(@RequestBody S object) {
        return genericService.update(object);
    }

    @DeleteMapping
    public S delete(@RequestBody S object) {
        return genericService.delete(object);
    }

    @GetMapping
    public List<S> findAll() {
        return genericService.findAll();
    }

    @GetMapping(path = "/{id}")
    public S findById(@PathVariable String id) {
        return genericService.findById(id);
    }
}
