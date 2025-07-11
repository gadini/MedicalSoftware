package com.github.gadini.medical.software.persistence.repository;

import com.github.gadini.medical.software.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
