package br.com.fiap.checkpoint2.dto;

import br.com.fiap.checkpoint2.model.Profissional;

public class ProfissionalRequestUpdate {
    private String especialidade;
    private Double valorHora;

    public Profissional toModel(Profissional profissional){
        profissional.setEspecialidade(this.especialidade);
        profissional.setValorHora(this.valorHora);
        return profissional;
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
}
