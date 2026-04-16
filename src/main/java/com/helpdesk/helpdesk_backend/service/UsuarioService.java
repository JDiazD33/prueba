package com.helpdesk.helpdesk_backend.service;

import java.util.List;

import com.helpdesk.helpdesk_backend.model.Usuario;

public interface UsuarioService {
    Usuario crear(Usuario usuario);

    Usuario obtenerPorId(Long id);

    List<Usuario> listarTodos();

    List<Usuario> listarPorEmpresa(Long empresaId);

    Usuario actualizar(Long id, Usuario usuario);

    void eliminar(Long id);

}
