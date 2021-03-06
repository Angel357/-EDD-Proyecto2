/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author luisa
 */
public class Ruta {
    public NodoRuta Inicio;
    public String rutaImpresa;
    public int Tamaño=0;
    public String GraficoGeneral;
    
    public Ruta(){
        this.Inicio=null;
    }
    
    public void insertar(int peso, int acumulado, String nombre){
        Tamaño++;
        NodoRuta nuevo=new NodoRuta(peso, acumulado, nombre);
        if(Inicio==null){
            Inicio=nuevo;
        }else{
            nuevo.siguiente=Inicio;
            Inicio=nuevo;
        }        
        System.out.println(Tamaño);
    }
    
   public void Graficar(){
        GraficoGeneral="";
        try{
              File fold=new File("RutaCorta.txt");
                fold.delete();
          }catch(Exception e1){
              
          }
          
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("RutaCorta.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);
            //Escribimos en el archivo con el metodo write 
            escribir.write("digraph { \r\n");
            escribir.write("node[shape=box];\r\n");
            GraficoGeneral+="node[shape=box]; \n";
            escribir.write("rankdir=LR;\r\n");
            NodoRuta aux=Inicio;
            while(aux!=null){
            if(aux.siguiente!=null){
                escribir.write("\"Tiempo: "+aux.acumulado+"\n"+aux.nombre+"\""+" -> ");
                GraficoGeneral+="\"Tiempo: "+aux.acumulado+"\\n"+aux.nombre+"\""+" -> ";
                //RecorridoImpreso +="Tiempo: "+aux.peso+"+"+aux.acumulado+"; "+aux.nombre+" -> ";
            }else{
                escribir.write("\"Tiempo: "+aux.acumulado+"\n"+aux.nombre+"\"");
                GraficoGeneral+="\"Tiempo: "+aux.acumulado+"\\n"+aux.nombre+"\"";
                //RecorridoImpreso +="Tiempo: "+aux.peso+"+"+aux.acumulado+"; "+aux.nombre;
            }
            aux=aux.siguiente;
        }
            
            
            escribir.write("\r\n}");
            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
         
        Runtime cmd=Runtime.getRuntime();
    String comando="dot -Tpng RutaCorta.txt -o RutaCorta.png";
    try{
        cmd.exec(comando);
        //cmd.exec("start TablaHash.txt");
    }catch(Exception ex){
        System.out.println("ex: "+ex.getMessage());
    }
    
    try{
        Thread.sleep(2000);
    }catch(InterruptedException e){
        
    }
        
        
    }
    
    public void Imprimir(){
        NodoRuta aux=Inicio;
        rutaImpresa="";
        while(aux!=null){
            if(aux.siguiente!=null){
                rutaImpresa+="[Lugar: "+aux.nombre+", Tiempo: "+aux.peso+" + "+aux.acumulado+"] -> ";    
            }else{
                rutaImpresa+="[Lugar: "+aux.nombre+", Tiempo: "+aux.peso+" + "+aux.acumulado+"]";        
            }
            aux=aux.siguiente;
        }
        System.out.println("\n\n"+rutaImpresa);
    }
    
}
