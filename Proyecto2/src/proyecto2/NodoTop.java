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
public class NodoTop {
    public String Nomnbre;
    public int numero;
    public NodoTop siguiente;
    public NodoTop anterior;
    
    public NodoTop(String Nombre, int numero){
        this.Nomnbre=Nombre;
        this.numero=numero;
    }
}
