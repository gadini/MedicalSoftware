package com.github.gadini.medical.software.controller;

import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.domain.response.DadosMedicoResponse;
import com.github.gadini.medical.software.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosMedicoRequest request){
        medicoService.salvarMedico(request);
    }

    @GetMapping
    public List<DadosMedicoResponse> listar(){
        return medicoService.listarMedicos();
    }

}
