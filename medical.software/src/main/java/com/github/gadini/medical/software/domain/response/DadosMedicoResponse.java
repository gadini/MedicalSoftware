package com.github.gadini.medical.software.domain.response;

public class DadosMedicoResponse {

    private Long id;
    private String nome;
    private String email;
    private String crm;

    public DadosMedicoResponse() {
    }

    public DadosMedicoResponse(Long id, String nome, String email, String crm) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.crm = crm;
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
}
