package com.github.gadini.medical.software.domain.response;

public class DadosTokenJwtResponse {

    private String token;

    public DadosTokenJwtResponse() {
    }

    public DadosTokenJwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
