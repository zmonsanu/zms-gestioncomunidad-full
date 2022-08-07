package com.zms.gestioncomunidad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zms.gestioncomunidad.model.Propietario;
import com.zms.gestioncomunidad.repository.PropietarioRepository;

@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Override
    public List<Propietario> getAllPropietarios() {
        return propietarioRepository.findAll();
    }

    @Override
    public Optional<Propietario> getPropietarioById(long id) {
        return propietarioRepository.findById(id);
    }

    @Override
    public Propietario getPropietarioByNumeroDocumento(String numeroDocumento) {
        return propietarioRepository.findByNumeroDocumento(numeroDocumento);
    }

    public Propietario save(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }
}
