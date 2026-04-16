package com.helpdesk.helpdesk_backend.service;

import com.helpdesk.helpdesk_backend.model.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {
    
    // CRUD Básico
    List<Empresa> listarTodos();
    Optional<Empresa> buscarPorId(Long id);
    Empresa guardar(Empresa empresa);
    Empresa actualizar(Long id, Empresa empresa);
    void eliminar(Long id);

    // Métodos Custom
    Optional<Empresa> buscarPorRuc(String ruc);
    Optional<Empresa> buscarPorCorreoContacto(String correoContacto);
    boolean existePorRuc(String ruc);
    boolean existePorCorreoContacto(String correoContacto);
}
