/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stuff;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wilson
 */
public class NodoB {
    String[] keys;  // llaves
    // Objetos tipo Vehiculo
    int t;  // grado
    NodoB[] C; // arreglo de punteros hijos
    int n; // total de nodos
    boolean hoja;  // verificar si es hoja
    
    NodoB(int t, boolean hoja)
    {
        this.t = t;
        this.hoja = hoja;
        this.keys = new String[2*t - 1];
        //this.keys = new String[t-1];
        this.C = new NodoB[2*t];
        this.n = 0;
    }
    
    // Mostrar arbol traverse
    public void imprimir()
    {
        
        int i = 0;
        for (i = 0; i < n ; i++)
        {
            System.out.print("   i." + i);
            System.out.print(" n:" + n);
            System.out.print("hoja: " + String.valueOf(this.hoja)+"--->");
            if(hoja==false)
            {
                //System.out.print("Si entra");
                C[i].imprimir();
                //System.out.print(C[i+1].keys[i]+ " ");
            }
                
            System.out.print(keys[i] + " ");
            System.out.println("");
       
        }
        
        
        if(hoja == false)
            C[i].imprimir();
    }
    
    /// graph outline
    public void getDot(NodoB n)
    {
        NodoB aux = n;

        String label;
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("graphBlock.dot");
            
            if(archivo.exists())
            {
                archivo.delete();
                try{
                    archivo.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            
            FileWriter escribir = new FileWriter(archivo, true);
            
            //Escribimos en el archivo con el metodo write 
            // setting the una lista doble;
            escribir.write("digraph {\r\n");
            escribir.write("node[shape=box];\r\n");
            escribir.write("rankdir=LR;\r\n");
            // Dibujar nodos y links
            
         /*
            System.out.println(current.getKey() + "->");
            current = current.getNext();
          */
                String link="";

            while(aux != null)
            {
                // Cuando no hay datos cargados borra todo, porque es null
                //link = link + aux.getKey() + "->" + aux.prev.data.getDpi() + "\r\n";
                escribir.write(link);
            }

            
            escribir.write(" }\r\n");
            
            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

        Runtime cmd = Runtime.getRuntime();
        String comando = "dot -Tpng graphBlock.dot -o graphBlock.png";
        try {
            cmd.exec(comando);
            //cmd.exec("start .\\graphListaC.txt");
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
        }
        
        //Pausar antes de mostrar
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            
        }
    }
    
    // Buscar algun nodo, regresa nulo si no existe
    int i;
    NodoB buscar(String k)
    {
        i = 0;
        while(i < n && k.compareToIgnoreCase(keys[i]) > 0)
            i++;
        try
        {
            if (keys[i].compareToIgnoreCase(k) == 0) {
                setCurrentKey(i);
                return this;
            }
        }catch(Exception ex) { ex.printStackTrace();}
        
            
        if(hoja==true)
            return null;
        
        return C[i].buscar(k);
    }
    
    // Para accesar la llave actual.
    public void setCurrentKey(int i)
    {
        this.i = i;
    }
    
    public void insertarNoLleno(String k)
    {
        int i = n - 1;
        
        // si es hoja
        if(hoja == true)
        {
            while(i >= 0 && keys[i].compareToIgnoreCase(k) > 0)
            {
                keys[i+1] = keys[i];
                i--;
            }
            keys[i+1] = k;
            n = n+1;
        }
        else // si no es hoja
        {
            while(i >= 0 && keys[i].compareToIgnoreCase(k) > 0)
                i--;
            
            // Si el hijo esta lleno
            if(C[i+1].n == 2*t-1)
            {
                separarHijo(i+1,C[i+1]);
                if(keys[i+1].compareToIgnoreCase(k) < 0)
                    i++;
            }
            C[i+1].insertarNoLleno(k);
        }
        
    }

    public void separarHijo(int i, NodoB y)
    {
        NodoB z = new NodoB(y.t,y.hoja);
        z.n = t - 1;
        
        for(int j = 0; j < t-1;j++)
            z.keys[j] = y.keys[j+t];
        
        if(y.hoja == false)
        {
            for(int j = 0; j < t; j++)
                z.C[j] = y.C[j+t];
        }
        y.n = t - 1;
        
        for(int j = n; j >= i+1;j--)
            C[j+1] = C[j];
        
        C[i+1] = z;
        
        for(int j = n -1; j >= i; j--)
            keys[j+1] = keys[j];
        
        
        keys[i] = y.keys[t-1];
        
        n = n + 1;
    }
    
    
}