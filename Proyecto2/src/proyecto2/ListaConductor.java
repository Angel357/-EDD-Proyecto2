/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author wilson
 */
public class ListaConductor {
    NodoLD start;
    
    ListaConductor()
    {
        this.start = null;
    }
    
    // insersion al final
    public void insertarFinal(Conductor value)
    {
        if(start == null)
        {
            NodoLD newNode = new NodoLD();
            newNode.data = value;
            newNode.next = newNode.prev = newNode;
            start = newNode;
            return;
        }
        
        NodoLD ultimo = (start).prev;
        NodoLD newNode = new NodoLD();
        newNode.data = value;
        
        // ciruclar
        newNode.next = start;
        (start).prev = newNode;
        
        // conexion doble
        newNode.prev = ultimo;
        ultimo.next = newNode;
                
    }
    
    // buscar funcionando
    public NodoLD buscar(BigInteger key)
    {
        if(start == null)
            return null;
        
        NodoLD actual = start;
        
        while(actual.data.getDpi().compareTo(key) != 0){
            if(actual.next == start)
            {
                System.out.println("No existe");
                return null;
            }
            
            actual = actual.next;
        }
        
        return actual;
    }
    
    // Eliminar funcionando
    public void eliminar(BigInteger key)
    {
        if(start==null)
            return;
        
        NodoLD actual = start;
        NodoLD ant = null;
        
        // buscar si exite
        while(actual.data.getDpi() != key){
            if(actual.next == start)
            {
                System.out.println("No existe");
                return;
            }
            ant = actual;
            actual = actual.next;
        }
        
        // Verificar si es el unico nodo
        if(actual.next == start && ant == null)
        {
            (start) = null;
            return;
        }
        
        // Verificar si es el primer nodo
        if(actual == start)
        {
            ant = (start).prev;
            start = (start).next;
            
            ant.next = start;
            (start).prev = ant;
        }
        // verificar si es el ultimo
        else if(actual.next == start){
            ant.next = start;
            (start).prev = ant;
        }else
        {
            NodoLD temp = actual.next;
            ant.next = temp;
            temp.prev = ant;
        }
        return;
    }
    
    public void imprimir()
    {
        NodoLD temp = start;
        System.out.println("Lista doble de conductores \n");
        
        while(temp.next != start)
        {
            System.out.print(temp.data.getDpi() + " " );
            temp = temp.next;
        }
        
        // se sale del ciclo cuando el ultimo apunta al primero
        // por eso se imprime el ultimo aca
        System.out.print(temp.data.getDpi() + "\n");
    }
    
    
    public void graph()
    {
        getDot(start);
    }
    
    public void getDot(NodoLD n)
    {
        NodoLD aux = n;

        /*
        try {
            File fold = new File("tablaHash.txt");
            fold.delete();
        } catch (Exception e1) {

        }*/
        String label;
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("graphListaC.dot");
            
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
            
            
            do {
                // Cuando no hay datos cargados borra todo, porque es null
                label = aux.data.getDpi().toString() + "[shape=box, label=\"" + aux.data.getDpi().toString() + "\"]; \r\n";
                escribir.write(label);
                String link = aux.data.getDpi() + "->" + aux.next.data.getDpi() + "\r\n";
                link = link + aux.data.getDpi() + "->" + aux.prev.data.getDpi() + "\r\n";
                escribir.write(link);
                aux = aux.next;
            }while(aux != start);
            
            escribir.write(" }\r\n");
            
            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

        Runtime cmd = Runtime.getRuntime();
        String comando = "dot -Tpng graphListaC.dot -o graphListaC.png";
        try {
            cmd.exec(comando);
            //cmd.exec("start .\\graphListaC.txt");
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
        }

        ReporteLista r = new ReporteLista();
        r.setImage("graphListaC.png");
        r.setVisible(true);
    }
    
    
    /// Metodo de prueba
    public void ordenar()
    {
        NodoLD aux = start;
        NodoLD aux2 = start.next;
        
        NodoLD test = null;
        
        while(aux.next.next != start)
        {
            while(aux2.next != start)
            {
                if(aux.data.getDpi().compareTo(aux2.data.getDpi()) == 1)
                {
                    test.data = aux2.data;
                    aux2.data = aux.data;
                    aux.data = test.data;
                    start.data = aux.data;
                }
                aux2 = aux2.next;
            }
            
            aux = aux.next;
        }
    }
}
