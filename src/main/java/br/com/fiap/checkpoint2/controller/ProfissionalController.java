package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.dto.*;
import br.com.fiap.checkpoint2.service.PacienteService;
import br.com.fiap.checkpoint2.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("profissional")
public class ProfissionalController {

    @Autowired
    private ProfissionalService service;

    @PostMapping
    public ResponseEntity<ProfissionalResponse> create(@RequestBody ProfissionalRequestCreate dto){
        return ResponseEntity.status(201).body(new ProfissionalResponse().toDto(service.create(dto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfissionalResponse> update(@PathVariable Long id, @RequestBody ProfissionalRequestUpdate dto){
        return service.updateProfissional(id, dto)
                .map(p -> new ProfissionalResponse().toDto(p))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfissionalResponse> findById(@PathVariable Long id){
        return service.getById(id)
                .map(p -> new ProfissionalResponse().toDto(p))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ProfissionalResponse>> findAll(){
        List<ProfissionalResponse> response =
                service.getAll().stream()
                        .map(p -> new ProfissionalResponse().toDto(p))
                        .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        boolean result = service.delete(id);
        if (result){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }




}

