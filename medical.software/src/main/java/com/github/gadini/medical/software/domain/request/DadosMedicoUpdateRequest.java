package com.github.gadini.medical.software.domain.request;

import com.github.gadini.medical.software.domain.dto.EnderecoDto;
import jakarta.validation.constraints.NotNull;

public class DadosMedicoUpdateRequest {

    @NotNull
    private Long id;
    private String nome;
    private String telefone;
    private EnderecoDto endereco;

    public DadosMedicoUpdateRequest() {
    }

    public DadosMedicoUpdateRequest(Long id, String nome, String telefone, EnderecoDto endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
