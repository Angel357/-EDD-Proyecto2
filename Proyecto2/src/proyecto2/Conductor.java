/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.math.BigInteger;

/**
 *
 * @author wilson
 */
public class Conductor {

    /**
     * @return the dpi
     */
    public BigInteger getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(BigInteger dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the tipoLicencia
     */
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    /**
     * @param tipoLicencia the tipoLicencia to set
     */
    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    private BigInteger dpi;
    private String nombres;
    private String apellidos;
    private String tipoLicencia;
    private String genero;
    private String telefono;
    private String direccion;
    
    public Conductor()
    {
        //this.dpi = BigInteger.valueOf(0);
    }
    
    public Conductor(BigInteger dpi, String nombres, String apellidos, String tipoLicencia, String genero, String telefono, String direccion)
    {
        this.dpi = dpi;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoLicencia = tipoLicencia;
        this.genero = genero;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
}
