/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class ColaAdyacentes {
    public NodoCola Inicio;
    
    public NodoCola Pad;
    
    public String Destino;
    public String GraficoGeneral="";
    public String RecorridoImpreso="";
    public int pesoAcumulado=0;
    
    public Ruta ruta;
    public Grafo g;
    
    public String origen;
    public String destino;
    
    public ColaAdyacentes(){
        this.Inicio=null;
        this.Pad=null;
    }
      
    public void insertar(int peso,int acumulado, String nombre){
        NodoCola nuevo=new NodoCola(peso,acumulado,nombre);
        nuevo.Padre=Pad;
        if(Pad!=null){
         nuevo.acumulado=nuevo.acumulado+Pad.acumulado;   
        }else{
            nuevo.acumulado=nuevo.acumulado;
        }
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
        try{
            if(Inicio.siguiente!=null){
               Inicio=Inicio.siguiente;
               Inicio.anterior=null; 
            }else{
                Inicio=null;
            }
        }catch(Exception e5){
            JOptionPane.showMessageDialog(null, "No hay ninguna ruta disponible de: "+origen+" hacia: "+destino);
        }
    }
    
    public void imprimir(){
        NodoRuta aux=ruta.Inicio;
        while(aux!=null){
            if(aux.siguiente!=null){
                RecorridoImpreso +="Tiempo: "+aux.peso+"+"+aux.acumulado+"; "+aux.nombre+" -> ";
            }else{
                RecorridoImpreso +="Tiempo: "+aux.peso+"+"+aux.acumulado+"; "+aux.nombre;
            }
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
        this.origen=Origen;
        this.destino=Destino;
        insertar(0,0,Origen);
        Pop();
        InsertarAdyacentes();
        while(!Pad.nombre.equals(Destino)){
          Pop();
            if(Pad.nombre.equals(Destino)){
                break;
            }else{
                InsertarAdyacentes();
            }
        }
        ruta = new Ruta();
        ruta.Tamaño=0;
        while(Pad!=null){
            ruta.insertar(Pad.peso, Pad.acumulado, Pad.nombre);
            Pad=Pad.Padre;
        }
        
        imprimir();
    }
    
    public void GenerarGrafo(){
        Grafo grafo= new Grafo();
        grafo.GenerarGrafo();
        this.g=grafo;
    }
    
    public void Graficar(){
        ruta.Graficar();
    }
    
    public void MostrarGrafico(){
        ReporteHash r=new ReporteHash();
        r.setImagen("RutaCorta.png");
        r.setVisible(true);
    }
    
    
}
