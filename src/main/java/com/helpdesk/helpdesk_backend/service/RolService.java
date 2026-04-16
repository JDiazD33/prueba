package com.helpdesk.helpdesk_backend.service;

import java.util.List;

import com.helpdesk.helpdesk_backend.model.Rol;

public interface RolService {

    Rol crear(Rol rol);

    Rol obtenerPorId(Long id);

    List<Rol> listarTodos();

    Rol actualizar(Long id, Rol rol);

    void eliminar(Long id);

}
