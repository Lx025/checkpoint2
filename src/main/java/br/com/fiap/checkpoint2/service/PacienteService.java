package br.com.fiap.checkpoint2.service;


import br.com.fiap.checkpoint2.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint2.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    private Long sequence = 1L;
    private List<Paciente> pacientes = new ArrayList<>();
    public Paciente create(PacienteRequestCreate dto){
        return repository.save(dto.toModel());
    }

    public Optional<Paciente> updatePaciente(Long id, PacienteRequestUpdate dto){
        return repository.findById(id)
                .map(p -> repository.save(dto.toModel(p)));
    }

    public Optional<Paciente> getById(Long id) {
        return repository.findById(id);

    }

    public List<Paciente> getAll() {
        return repository.findAll();
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}
