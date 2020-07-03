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
public class ListaAuxArbol {
    nodoAuxArbol inicio;
    
    public ListaAuxArbol(){
        this.inicio=null;
    }
    
    public void insertar(String placa, String nodo, String f){
        nodoAuxArbol nuevo=new nodoAuxArbol(placa, nodo, f);
        if(inicio==null){
            inicio=nuevo;
        }
        else{
            nuevo.siguiente=inicio;
            inicio=nuevo;
        }
        
    }
    
    
    
}
