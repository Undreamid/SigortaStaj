package com.tahapamuk.priminfo.controller;

import com.tahapamuk.priminfo.model.PrimInfo;
import com.tahapamuk.priminfo.repository.PrimRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/priminfo")

public class PrimController {

    @Autowired
    private PrimRepo primrepository;

    @GetMapping
    public List<PrimInfo> findAll() {

        return primrepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<PrimInfo> findById(@PathVariable Integer id) {
        return Optional.ofNullable(primrepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Info not found.")));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create( @RequestBody PrimInfo primInfo) {
        primrepository.save(primInfo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update( @RequestBody PrimInfo primInfo, @PathVariable Integer id) {
        if(!primrepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Info not found.");
        }
        primrepository.save(primInfo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        primrepository.deleteById(id);
    }

}
