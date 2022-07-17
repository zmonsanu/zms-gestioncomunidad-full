package com.zms.gestioncomunidad.service;

import java.util.List;

import com.zms.gestioncomunidad.model.Vivienda;

public interface ViviendaService {

    List<Vivienda> getByPropietario(Long idPropietario);
}
