package br.com.fiap.checkpoint2.controller;


import br.com.fiap.checkpoint2.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint2.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint2.dto.PacienteResponse;
import br.com.fiap.checkpoint2.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequestCreate dto){
        return ResponseEntity.status(201).body(new PacienteResponse().toDto(service.create(dto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponse> update(@PathVariable Long id, @RequestBody PacienteRequestUpdate dto){
        return service.updatePaciente(id, dto)
                .map(p -> new PacienteResponse().toDto(p))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponse> findById(@PathVariable Long id){
        return service.getById(id)
                .map(p -> new PacienteResponse().toDto(p))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponse>> findAll(){
        List<PacienteResponse> response =
                service.getAll().stream()
                    .map(p -> new PacienteResponse().toDto(p))
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
