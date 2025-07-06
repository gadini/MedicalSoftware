package com.github.gadini.medical.software.domain.mapper;

import com.github.gadini.medical.software.domain.request.DadosMedicoRequest;
import com.github.gadini.medical.software.domain.request.DadosMedicoUpdateRequest;
import com.github.gadini.medical.software.domain.response.DadosMedicoResponse;
import com.github.gadini.medical.software.persistence.entity.Medico;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface MedicoMapper {
    @Mapping(target = "id", ignore = true)
    Medico toEntity(DadosMedicoRequest request);

    @Mapping(target = "email", ignore = true)
    @Mapping(target = "crm", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(DadosMedicoUpdateRequest dto, @MappingTarget Medico entity);

    DadosMedicoResponse toResponse(Medico medico);
}
