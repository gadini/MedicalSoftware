package com.github.gadini.medical.software.domain.request;

public class DadosAutenticacaoRequest {

    String login;
    String senha;

    public DadosAutenticacaoRequest() {
    }

    public DadosAutenticacaoRequest(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
