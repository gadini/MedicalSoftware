package com.github.gadini.medical.software.domain.request;

import com.github.gadini.medical.software.domain.dto.EnderecoDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class DadosMedicoRequest {

    @NotNull
    private String nome;

    @NotNull
    private String email;

    @NotNull
    private String crm;

    private String telefone;

    @NotNull
    @Valid
    private EnderecoDto endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }
}
