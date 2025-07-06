package com.github.gadini.medical.software.domain.mapper;

import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.domain.response.DadosMedicoResponse;
import com.github.gadini.medical.software.persistence.entity.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MedicoMapper {
    @Mapping(target = "id", ignore = true)
    Medico toEntity(DadosMedicoRequest request);

    DadosMedicoResponse toResponse(Medico medico);
}
