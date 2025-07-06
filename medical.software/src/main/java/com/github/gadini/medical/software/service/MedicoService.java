package com.github.gadini.medical.software.service;

import com.github.gadini.medical.software.domain.mapper.MedicoMapper;
import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.domain.request.DadosMedicoUpdateRequest;
import com.github.gadini.medical.software.domain.response.DadosMedicoResponse;
import com.github.gadini.medical.software.persistence.entity.Medico;
import com.github.gadini.medical.software.persistence.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoService {

    @Autowired
    private MedicoMapper medicoMapper;

    @Autowired
    private MedicoRepository medicoRepository;

    @Transactional
    public void salvarMedico(DadosMedicoRequest request){
        Medico medico = medicoMapper.toEntity(request);
        medicoRepository.save(medico);
    }

    public Page<DadosMedicoResponse> listarMedicos(Pageable pageable){
        return medicoRepository.findAll(pageable)
                .map(medicoMapper::toResponse);
    }

    @Transactional
    public void atualizarMedico(DadosMedicoUpdateRequest request){
        Medico medico = medicoRepository.getReferenceById(request.getId());
        medicoMapper.updateEntityFromDto(request, medico);
    }

    @Transactional
    public void excluirMedico(Long id){
        medicoRepository.deleteById(id);
    }
}
