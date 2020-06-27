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
public class NodoRuta {
    public NodoRuta siguiente;
    public String nombre;
    public int acumulado;
    public int peso;
    
    public NodoRuta(int peso, int acumulado, String nombre){
        this.peso=peso;
        this.acumulado=acumulado;
        this.nombre=nombre;
        this.siguiente=null;
    }
    
}
