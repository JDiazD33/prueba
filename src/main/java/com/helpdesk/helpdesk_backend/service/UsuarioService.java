package com.helpdesk.helpdesk_backend.service;

import com.helpdesk.helpdesk_backend.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    
    // CRUD Básico
    List<Usuario> listarTodos();
    Optional<Usuario> buscarPorId(Long id);
    Usuario guardar(Usuario usuario);
    Usuario actualizar(Long id, Usuario usuario);
    void eliminar(Long id);

    // Métodos Custom
    Optional<Usuario> buscarPorEmail(String email);
    boolean existeEmail(String email);
    List<Usuario> listarPorEmpresa(Long empresaId);
    List<Usuario> listarPorRol(Long rolId);
    List<Usuario> listarActivosPorEmpresa(Long empresaId, boolean activo);
    List<Usuario> listarPorEmpresaYRol(Long empresaId, Long rolId);
    List<Usuario> listarPorEstado(boolean activo);
}
