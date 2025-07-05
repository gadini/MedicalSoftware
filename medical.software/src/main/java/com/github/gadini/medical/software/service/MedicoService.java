package com.github.gadini.medical.software.service;

import com.github.gadini.medical.software.domain.mapper.MedicoMapper;
import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.persistence.entity.Medico;
import com.github.gadini.medical.software.persistence.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoMapper medicoMapper;

    @Autowired
    private MedicoRepository medicoRepository;

    public void salvarMedico(DadosMedicoRequest request){
        Medico medico = medicoMapper.toEntity(request);
        medicoRepository.save(medico);
    }
}
