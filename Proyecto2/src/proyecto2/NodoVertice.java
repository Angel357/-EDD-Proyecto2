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
public class NodoVertice {
    public ListaAdyacente listaAdyacente;
    public NodoVertice siguiente;        
    public String Vertice;
    
    public NodoVertice(String Vertice, ListaAdyacente l){
        this.Vertice=Vertice;
        this.listaAdyacente=l;
        this.siguiente=null;
    }
}
