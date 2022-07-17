package com.zms.gestioncomunidad.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="gc_propietarios")
@NamedQueries({@NamedQuery (name="Propietario.findByNumeroDocumento",
query="FROM Propietario p WHERE p.numeroDocumento LIKE :numeroDocumento")
})
public class Propietario {
    @Id
    @Column(name = "ID_PROPIETARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPropietario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO1")
    private String apellido1;

    @Column(name = "APELLIDO2")
    private String apellido2;

    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "MOVIL")
    private String movil;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "MUNICIPIO")
    private String municipio;

    @Column(name = "PROVINCIA")
    private String provincia;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "IBAN")
    private String iban;

    @Column(name = "VERSION")
    @Version
    private int version;

    @Column(name = "AUD_APL")
    private String audApl;

    @Column(name = "AUD_USR")
    private String audUsr;

    @JsonManagedReference
    @OneToMany(mappedBy="propietario")
    private List<Vivienda> viviendas;

    public long getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(long idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getAudApl() {
        return audApl;
    }

    public void setAudApl(String audApl) {
        this.audApl = audApl;
    }

    public String getAudUsr() {
        return audUsr;
    }

    public void setAudUsr(String audUsr) {
        this.audUsr = audUsr;
    }
    public List<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(List<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

}
