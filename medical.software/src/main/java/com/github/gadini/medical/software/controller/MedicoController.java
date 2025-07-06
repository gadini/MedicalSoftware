package com.github.gadini.medical.software.controller;

import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.domain.request.DadosMedicoUpdateRequest;
import com.github.gadini.medical.software.domain.response.DadosMedicoCreatedResponse;
import com.github.gadini.medical.software.domain.response.DadosMedicoResponse;
import com.github.gadini.medical.software.domain.response.DadosMedicoUpdatedResponse;
import com.github.gadini.medical.software.service.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @PostMapping
    public ResponseEntity<DadosMedicoCreatedResponse> cadastrar(@RequestBody @Valid DadosMedicoRequest request, UriComponentsBuilder uriComponentsBuilder){
        DadosMedicoCreatedResponse response = medicoService.salvarMedico(request);

        URI uri = uriComponentsBuilder
                .path("/medicos/{id}")
                .buildAndExpand(response.getId()).toUri();

        return ResponseEntity.created(uri).body(response);
    }

    @GetMapping
    public ResponseEntity<Page<DadosMedicoResponse>> listar(@PageableDefault(size = 5, sort = {"nome"}) Pageable pageable){
        return ResponseEntity.ok(medicoService.listarMedicos(pageable));
    }

    @PutMapping
    public ResponseEntity<DadosMedicoUpdatedResponse> atualizar(@RequestBody @Valid DadosMedicoUpdateRequest request){
        return ResponseEntity.ok(medicoService.atualizarMedico(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        medicoService.excluirMedico(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosMedicoCreatedResponse> detalhar(@PathVariable Long id){
        return ResponseEntity.ok(medicoService.consultarMedico(id));
    }

}
