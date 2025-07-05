package com.github.gadini.medical.software.repository;

import com.github.gadini.medical.software.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
