package br.com.fiap.checkpoint2.service;

import br.com.fiap.checkpoint2.dto.ProfissionalRequestCreate;
import br.com.fiap.checkpoint2.dto.ProfissionalRequestUpdate;
import br.com.fiap.checkpoint2.model.Profissional;
import br.com.fiap.checkpoint2.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfissionalService {

    @Autowired
    private ProfissionalRepository repository;

    public Profissional create(ProfissionalRequestCreate dto){
        return repository.save(dto.toModel());
    }

    public Optional<Profissional> updateProfissional(Long id, ProfissionalRequestUpdate dto){
        return repository.findById(id)
                .map(p -> repository.save(dto.toModel(p)));
    }

    public Optional<Profissional> getById(Long id) {
        return repository.findById(id);

    }

    public List<Profissional> getAll() {
        return repository.findAll();
    }

    public boolean delete(Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
