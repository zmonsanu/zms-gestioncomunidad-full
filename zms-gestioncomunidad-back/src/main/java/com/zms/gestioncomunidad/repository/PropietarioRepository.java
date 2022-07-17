package com.zms.gestioncomunidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zms.gestioncomunidad.model.Propietario;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {

    public Propietario findByNumeroDocumento(String numeroDocumento);
}
