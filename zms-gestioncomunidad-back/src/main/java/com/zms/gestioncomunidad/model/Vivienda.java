package com.zms.gestioncomunidad.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="gc_viviendas")
public class Vivienda {
    @Id
    @Column(name = "ID_VIVIENDA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVivienda;

    @Column(name = "DESCRIPCION_VIVIENDA")
    private String descripcionVivienda;

    @Column(name = "NUMERO_VIVIENDA")
    private String numeroVivienda;

    @Column(name = "PORTAL_VIVIENDA")
    private String portalVivienda;

    @Column(name = "COEFICIENTE_VIVIENDA")
    private BigDecimal coeficienteVivienda;

    @Column(name = "ID_PROPIETARIO")
    private String idPropietario;

    @Column(name = "CUOTA")
    private String cuota;

    @Column(name = "VERSION")
    @Version
    private int version;

    @Column(name = "AUD_APL")
    private String audApl;

    @Column(name = "AUD_USR")
    private String audUsr;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "ID_PROPIETARIO", insertable = false, updatable = false)
    private Propietario propietario;

    public long getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(long idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getDescripcionVivienda() {
        return descripcionVivienda;
    }

    public void setDescripcionVivienda(String descripcionVivienda) {
        this.descripcionVivienda = descripcionVivienda;
    }

    public String getNumeroVivienda() {
        return numeroVivienda;
    }

    public void setNumeroVivienda(String numeroVivienda) {
        this.numeroVivienda = numeroVivienda;
    }

    public String getPortalVivienda() {
        return portalVivienda;
    }

    public void setPortalVivienda(String portalVivienda) {
        this.portalVivienda = portalVivienda;
    }

    public BigDecimal getCoeficienteVivienda() {
        return coeficienteVivienda;
    }

    public void setCoeficienteVivienda(BigDecimal coeficienteVivienda) {
        this.coeficienteVivienda = coeficienteVivienda;
    }

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
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
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

}
