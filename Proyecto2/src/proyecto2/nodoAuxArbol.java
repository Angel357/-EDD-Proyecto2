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
public class nodoAuxArbol {
    String placa ;
    String Nodo;
    String f;
    nodoAuxArbol siguiente;
    
    public nodoAuxArbol(String placa, String nodo, String f){
        this.placa=placa;
        this.Nodo=nodo;
        this.f=f;
        this.siguiente=null;
    }
}
