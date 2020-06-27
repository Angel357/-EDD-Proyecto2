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
public class ListaAdyacente {
    public NodoAdyacente Inicio;
    public NodoAdyacente Fin;
    
    public ListaAdyacente(){
        Inicio=null;
        Fin=null;
    }
    
    public void Insertar(String Destino, int peso)
    {
        NodoAdyacente Nuevo = new NodoAdyacente(Destino, peso);
        if(Inicio!=null)
        {
            Fin.siguiente=Nuevo;
            Fin=Nuevo;
        }else{
            Inicio=Fin=Nuevo;
        }
    }
    
}
