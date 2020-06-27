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
public class NodoAdyacente {
    public NodoAdyacente siguiente;
    public String Destino;
    public int Peso;
    
    public NodoAdyacente(String Destino, int Peso)
    {
        
        this.Destino=Destino;
        this.Peso=Peso;
        this.siguiente=null;
    }
    
}
