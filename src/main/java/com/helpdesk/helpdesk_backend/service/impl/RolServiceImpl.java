package com.helpdesk.helpdesk_backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.helpdesk.helpdesk_backend.model.Rol;
import com.helpdesk.helpdesk_backend.service.RolService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    @Override
    public Rol crear(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol obtenerPorId(Long id) {
        return rolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con ID: " + id));
    }

    @Override
    public List<Rol> listarTodos() {
        return rolRepository.findAll();
    }

    @Override
    public Rol actualizar(Long id, Rol rolActualizado) {
        Rol rol = rolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con ID: " + id));
        rol.setNombre(rolActualizado.getNombre());
        return rolRepository.save(rol);
    }

    @Override
    public void eliminar(Long id) {
        Rol rol = rolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con ID: " + id));
        rolRepository.delete(rol);
    }


    


}
