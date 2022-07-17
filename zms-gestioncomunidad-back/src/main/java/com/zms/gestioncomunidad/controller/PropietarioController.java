package com.zms.gestioncomunidad.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zms.gestioncomunidad.model.Propietario;
import com.zms.gestioncomunidad.service.PropietarioService;

@RestController
public class PropietarioController {

        private PropietarioService propietarioService;

        @Autowired
        public void setPropietarioService(PropietarioService propietarioService){
            this.propietarioService = propietarioService;
        }

        @GetMapping ("/propietarios")
        public List<Propietario> getAllPropietarios() {
            return propietarioService.getAllPropietarios();
        }

        @GetMapping ("/propietario/{id}")
        public Propietario getPropietarioById(@PathParam("id")Long id) {
            return propietarioService.getPropietarioById(id);
        }

        @GetMapping ("/propietario/numeroDocumento/{numeroDocumento}")
        public Propietario getPropietarioByNumeroDocumento(@PathVariable("numeroDocumento")String numeroDocumento) {
            return propietarioService.getPropietarioByNumeroDocumento(numeroDocumento);
        }

        @PostMapping
        public void save(Propietario propietario) {
            propietarioService.save(propietario);
        }
    }
