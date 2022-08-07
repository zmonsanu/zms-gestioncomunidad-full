package com.zms.gestioncomunidad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zms.gestioncomunidad.model.Propietario;
import com.zms.gestioncomunidad.service.PropietarioService;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {

        private PropietarioService propietarioService;

        @Autowired
        public void setPropietarioService(PropietarioService propietarioService){
            this.propietarioService = propietarioService;
        }

        @GetMapping ("/all")
        public List<Propietario> getAllPropietarios() {
            return propietarioService.getAllPropietarios();
        }

        @GetMapping ("/propietario/{id}")
        public Propietario getPropietarioById(@PathVariable(value = "id") Long idPropietario) {
            Optional<Propietario> propietario = propietarioService.getPropietarioById(idPropietario);
            if (propietario.isPresent()) {
                return propietario.get();
            } else 
                return null;
        }

        @GetMapping ("/propietario/numeroDocumento/{numeroDocumento}")
        public Propietario getPropietarioByNumeroDocumento(@PathVariable("numeroDocumento")String numeroDocumento) {
            return propietarioService.getPropietarioByNumeroDocumento(numeroDocumento);
        }

        @PostMapping("/propietario")
        public ResponseEntity<Propietario> updatePropietario(@RequestBody Propietario propietarioDetalle) {
             Optional<Propietario>  propietarioOpt = propietarioService.getPropietarioById(propietarioDetalle.getIdPropietario());
             Propietario propietario;
             if (propietarioOpt.isPresent()) {
                propietario = propietarioOpt.get();
                propietario.setApellido1(propietarioDetalle.getApellido1());
                propietario.setApellido2(propietarioDetalle.getApellido2());
                propietario.setDireccion(propietarioDetalle.getDireccion());
                propietario.setEmail(propietarioDetalle.getEmail());
                propietario.setIban(propietarioDetalle.getIban());
                propietario.setMovil(propietarioDetalle.getMovil());
                propietario.setMunicipio(propietarioDetalle.getMunicipio());
                propietario.setNombre(propietarioDetalle.getNombre());
                propietario.setNumeroDocumento(propietarioDetalle.getNumeroDocumento());
                propietario.setTelefono(propietarioDetalle.getTelefono());
                propietarioService.save(propietario);
                return ResponseEntity.ok(propietario);
             }
             return ResponseEntity.ok(null);
             
        }

        @PutMapping("/propietario")
        public Propietario savePropietario(@RequestBody Propietario propietario) {
            return propietarioService.save(propietario);
        }
    }
