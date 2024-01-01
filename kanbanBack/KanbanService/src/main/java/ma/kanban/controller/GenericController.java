package ma.kanban.controller;

import lombok.AllArgsConstructor;
import ma.kanban.services.GenericService;
import ma.kanban.utils.IParent;
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

    @DeleteMapping
    public S delete(S object) {
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
