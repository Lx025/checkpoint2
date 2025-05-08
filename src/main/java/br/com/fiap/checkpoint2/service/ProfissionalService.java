package br.com.fiap.checkpoint2.service;

import br.com.fiap.checkpoint2.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint2.dto.ProfissionalRequestCreate;
import br.com.fiap.checkpoint2.dto.ProfissionalRequestUpdate;
import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.model.Profissional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfissionalService {

    private Long sequence = 1L;
    private List<Profissional> profissionais = new ArrayList<>();
    public Profissional create(ProfissionalRequestCreate dto){
        Profissional profissional = new Profissional();
        profissional.setId(sequence++);
        profissional.setNome(dto.getNome());
        profissional.setEspecialidade(dto.getEspecialidade());
        profissional.setValorHora(dto.getValorHora());
        profissional.setCreatedAt(dto.getCreatedAt());
        profissional.setUpdatedAt(dto.getUpdatedAt());
        profissionais.add(profissional);
        return profissional;
    }

    public Optional<Profissional> updateProfissional(Long id, ProfissionalRequestUpdate dto){
        return profissionais.stream().filter(profissional -> profissional.getId().equals(id)).findFirst()
                .map(p -> {
                    p.setValorHora(dto.getValorHora());
                    p.setEspecialidade(dto.getEspecialidade());
                    return p;
                });
    }

    public Optional<Profissional> getById(Long id) {
        return profissionais.stream().filter(profissional -> profissional.getId().equals(id)).findFirst();

    }

    public List<Profissional> getAll() {
        return profissionais;
    }

    public boolean delete(Long id){
        return profissionais.removeIf(profissional -> profissional.getId().equals(id));
    }
}
