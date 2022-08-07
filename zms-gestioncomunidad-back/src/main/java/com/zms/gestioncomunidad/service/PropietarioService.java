package com.zms.gestioncomunidad.service;

import java.util.List;
import java.util.Optional;

import com.zms.gestioncomunidad.model.Propietario;

public interface PropietarioService {

    List<Propietario> getAllPropietarios();

    Propietario save(Propietario propietario);

    Optional<Propietario> getPropietarioById(long id);

    Propietario getPropietarioByNumeroDocumento(String numeroDocumento);

}
