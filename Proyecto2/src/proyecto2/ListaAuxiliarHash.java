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
public class ListaAuxiliarHash {
    
    public NodoLAH Inicio;
    public NodoLAH Fin;
    public ListaAuxiliarHash()
    {
        Inicio=Fin=null;
        
    }
    
    public void Insertar(String DPI, String Nombre, String Apellido, String Genero, String Telefono, String Direccion)
    {
        NodoLAH nuevo=new NodoLAH(DPI, Nombre, Apellido, Genero, Telefono, Direccion);
        if(Inicio!=null)
        {
            Fin.siguiente=nuevo;
            Fin=nuevo;
        }
        else
        {
            Inicio=Fin=nuevo;
        }
        
    }
    
}
