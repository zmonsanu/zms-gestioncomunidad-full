package com.zms.gestioncomunidad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zms.gestioncomunidad.model.Vivienda;
import com.zms.gestioncomunidad.repository.ViviendaRepository;
import java.util.List;

@Service
public class ViviendaServiceImpl implements ViviendaService {

    @Autowired
    private ViviendaRepository viviendaRepository;

    @Override
    public List<Vivienda> getByPropietario (Long idPropietario) {
        return viviendaRepository.getByPropietario(idPropietario);
    }

}
