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
public class ListaSimple {
    
    public NodoLS Inicio;
    public NodoLS Fin;

    public ListaSimple() {
        this.Inicio = null;
        this.Fin = null;
    }
    
    public void Insertar(String DPI, String Nombre, String Apellido, String Genero, String Telefono, String Direccion)
    {
        NodoLS Nuevo=new NodoLS(DPI, Nombre, Apellido, Genero, Telefono, Direccion);
        
        if(Inicio==null)
        {
            Inicio=Fin=Nuevo;
        }
        else
        {
            Fin.siguiente=Nuevo;
            Nuevo.anterior=Fin;
            Fin=Nuevo;
        }
        
    }
    
    public void imprimir ()
    {
        NodoLS aux=Inicio;
        
        while(aux!=null)
        {
            System.out.println(aux.Nombre);
            aux=aux.siguiente;
        }
        
    }
    
    
    
}
