/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author luisa
 */
public class NodoLAH {
    public NodoLAH siguiente;
    public String DPI;
    public String Nombre;
    public String Apellido;
    public String Genero;
    public String Telefono;
    public String Direccion;

    public NodoLAH(String DPI, String Nombre, String Apellido, String Genero, String Telefono, String Direccion) {
        this.DPI = DPI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.siguiente = null;
    }
    
    
}
