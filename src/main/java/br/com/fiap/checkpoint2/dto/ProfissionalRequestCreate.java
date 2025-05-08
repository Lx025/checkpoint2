package br.com.fiap.checkpoint2.dto;

import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.model.Profissional;

import java.time.LocalDateTime;

public class ProfissionalRequestCreate {

    private String nome;
    private String especialidade;
    private Double valorHora;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Profissional toModel(){
        Profissional profissional = new Profissional();
        profissional.setNome(this.nome);
        profissional.setEspecialidade(this.especialidade);
        profissional.setValorHora(this.valorHora);
        profissional.setCreatedAt(this.createdAt);
        profissional.setUpdatedAt(this.updatedAt);
        return profissional;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
