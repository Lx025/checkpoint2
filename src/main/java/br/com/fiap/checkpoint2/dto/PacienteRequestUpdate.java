package br.com.fiap.checkpoint2.dto;

import br.com.fiap.checkpoint2.model.Paciente;

public class PacienteRequestUpdate {

    private String endereco;
    private String bairro;
    private String email;
    private String telefone;

    public Paciente toModel(Paciente paciente){
        paciente.setEndereco(this.endereco);
        paciente.setBairro(this.bairro);
        paciente.setEmail(this.email);
        paciente.setTelefone(this.telefone);
        return paciente;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
