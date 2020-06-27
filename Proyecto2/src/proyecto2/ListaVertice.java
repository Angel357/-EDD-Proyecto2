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
public class ListaVertice {
    public NodoVertice Inicio;
    public NodoVertice Fin;
    
    public ListaVertice(){
        this.Inicio=null;
        this.Fin=null;
    }
    
    public void Insertar(String Origen, String Destino, int peso){
        ListaAdyacente l=new ListaAdyacente();
        NodoVertice Nuevo = new NodoVertice(Origen,l);
        if(Inicio!=null){
             NodoVertice aux=Inicio;
             boolean bandera=true;
             while(aux!=null){
                 if(aux.Vertice.equals(Origen)){
                     aux.listaAdyacente.Insertar(Destino, peso);
                     bandera=false;
                 }
                 aux=aux.siguiente;
             }
            if(bandera){
                 Fin.siguiente=Nuevo;
                 Fin = Nuevo;
                 Fin.listaAdyacente.Insertar(Destino, peso);
            }          
        }else{
            Inicio=Fin=Nuevo;
            Inicio.listaAdyacente.Insertar(Destino, peso);
        }
        
        
    }//fin metodo insertar
    
    public void Imprimir(){
        NodoVertice auxV = Inicio;
        System.out.print("\n\n\n");
        while(auxV!=null){
            NodoAdyacente auxA=auxV.listaAdyacente.Inicio;
            System.out.print(auxV.Vertice+" -> { ");
            while(auxA!=null){
                if(auxA.siguiente!=null){
                    System.out.print(auxA.Destino+", ");
                }else{
                    System.out.print(auxA.Destino);
                }
                auxA=auxA.siguiente;
            }
            System.out.println(" }\n");
            auxV=auxV.siguiente;
        }
    }
    
    
    
}//fin clase ListaVertice
