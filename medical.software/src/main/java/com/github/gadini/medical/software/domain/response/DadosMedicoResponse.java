package com.github.gadini.medical.software.domain.response;

public class DadosMedicoResponse {

    private String nome;
    private String email;
    private String crm;

    public DadosMedicoResponse() {
    }

    public DadosMedicoResponse(String nome, String email, String crm) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;
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
