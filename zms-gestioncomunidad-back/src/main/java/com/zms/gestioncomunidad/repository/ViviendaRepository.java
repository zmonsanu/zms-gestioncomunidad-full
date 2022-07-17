package com.zms.gestioncomunidad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zms.gestioncomunidad.model.Vivienda;

public interface ViviendaRepository extends JpaRepository<Vivienda, Long> {

    public List<Vivienda> getByPropietario(Long idPropietario);
}
