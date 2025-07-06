package com.github.gadini.medical.software.controller;

import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.domain.request.DadosMedicoUpdateRequest;
import com.github.gadini.medical.software.domain.response.DadosMedicoResponse;
import com.github.gadini.medical.software.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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
    public Page<DadosMedicoResponse> listar(@PageableDefault(size = 5, sort = {"nome"}) Pageable pageable){
        return medicoService.listarMedicos(pageable);
    }

    @PutMapping
    public void atualizar(@RequestBody @Valid DadosMedicoUpdateRequest request){
        medicoService.atualizarMedico(request);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        medicoService.excluirMedico(id);
    }

}
