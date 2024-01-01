package ma.project.controllers;

import lombok.AllArgsConstructor;
import ma.project.services.GenericService;
import ma.project.utils.IParent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public class GenericController<S extends IParent> {
    private GenericService<S> genericService;

    @PostMapping
    public S save(@RequestBody S object) {
        return genericService.save(object);
    }

    @PutMapping
    public S update(@RequestBody S object) {
        return genericService.update(object);
    }

    @DeleteMapping(path = "/{id}")
    public S delete(@PathVariable String id) {
        return genericService.delete(id);
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
