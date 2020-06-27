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
public class ColaAdyacentes {
    public NodoCola Inicio;
    public NodoCola Pad;
    public String Destino;
    public ColaAdyacentes pops;
    public ColaAdyacentes Ruta;
    public int pesoAcumulado=0;
    public Ruta ruta;
    public Grafo g;
    
    public ColaAdyacentes(){
        this.Inicio=null;
        this.Pad=null;
    }
      
    public void insertar(int peso,int acumulado, String nombre){
        NodoCola nuevo=new NodoCola(peso,acumulado,nombre);
        nuevo.Padre=Pad;
        nuevo.acumulado=nuevo.acumulado+Pad.acumulado;
        NodoCola aux;
        if(Inicio==null){
            Inicio=nuevo;
        }
        else if(Inicio.acumulado>nuevo.acumulado){
            nuevo.siguiente=Inicio;
            nuevo.siguiente.anterior=nuevo;
            Inicio=nuevo;
        }
        else{
            aux=Inicio;
            while(aux.siguiente!=null&&aux.siguiente.acumulado<nuevo.acumulado){
            aux=aux.siguiente;
            }
            nuevo.siguiente=aux.siguiente;
            if(aux.siguiente!=null){
                nuevo.siguiente.anterior=nuevo;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        } 
    }
    
    public void Pop(){
        Pad=Inicio;
        if(Inicio.siguiente!=null){
           Inicio.anterior=null; 
           Inicio=Inicio.siguiente;
        }else{
            Inicio=null;
        }
    }
    
    public void imprimir(){
        NodoCola aux=Inicio;
        while(aux!=null){
            System.out.println("peso: "+aux.acumulado+", nombre: "+aux.nombre);
            aux=aux.siguiente;
        }
    }
    
    public void InsertarAdyacentes(){
        ListaVertice l=g.listaVertices;
        NodoVertice aux= l.Inicio;
        while(aux!=null){
            if(Pad.nombre.equals(aux.Vertice)){
                NodoAdyacente aux2=aux.listaAdyacente.Inicio;
                while(aux2!=null){
                    insertar(aux2.Peso,aux2.Peso,aux2.Destino);
                    aux2=aux2.siguiente;
                }
                break;
            }
            aux=aux.siguiente;
        }
    }
    
    public void ObtenerRuta(String Origen, String Destino){
        insertar(0,0,Origen);
        while(!Pad.nombre.equals(Destino)){
            Pop();
            if(Pad.nombre.equals(Destino)){
                ruta = new Ruta();
                while(Pad.Padre!=null){
                    ruta.insertar(Pad.peso, Pad.acumulado, Pad.nombre);
                    Pad=Pad.Padre;
                }
            }else{
                InsertarAdyacentes();
            }
        }
    }
    
    public void GenerarGrafo(){
        Grafo grafo= new Grafo();
        grafo.GenerarGrafo();
        this.g=grafo;
    }
    
    
    
}
