package com.zms.gestioncomunidad.service;

import java.util.List;

import com.zms.gestioncomunidad.model.Propietario;

public interface PropietarioService {

    List<Propietario> getAllPropietarios();

    void save(Propietario propietario);

    Propietario getPropietarioById(long id);

    Propietario getPropietarioByNumeroDocumento(String numeroDocumento);

}
