package com.github.gadini.medical.software.controller;

import com.github.gadini.medical.software.domain.request.DadosAutenticacaoRequest;
import com.github.gadini.medical.software.domain.response.DadosTokenJwtResponse;
import com.github.gadini.medical.software.infra.config.TokenService;
import com.github.gadini.medical.software.persistence.entity.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<DadosTokenJwtResponse> login(@RequestBody @Valid DadosAutenticacaoRequest dados) {
        var token = new UsernamePasswordAuthenticationToken(dados.getLogin(), dados.getSenha());
        var authentication = manager.authenticate(token);

        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJwtResponse(tokenJWT));
    }
}
