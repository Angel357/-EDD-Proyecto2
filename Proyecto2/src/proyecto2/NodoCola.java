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
public class NodoCola {
    public int peso;
    public int acumulado;
    public String nombre;
    public NodoCola siguiente;
    public NodoCola anterior;
    public NodoCola Padre;
    
    public NodoCola(int peso,int acumulado, String nombre){
        this.peso=peso;
        this.nombre=nombre;
        this.acumulado=acumulado;
        this.Padre=null;
        this.anterior=null;
        this.siguiente=null;
    }
    
}
