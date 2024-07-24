package com.itchencostore.itchencoStore.repository;

import com.itchencostore.itchencoStore.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
