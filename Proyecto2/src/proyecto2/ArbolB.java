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
 * @author wilson
 */
public class ArbolB {
    
    public nodoArbolB root;
    public int t;
    
    ArbolB(int t)
    {
        this.root = null;
        this.t = t;
    }
      
    public void imprimir()
    {
        if(this.root != null)
            this.root.imprimir();
        System.out.println();
    }
   
    public nodoArbolB buscar(String k)
    {
        if(this.root == null)
            return null;
        else 
            return this.root.buscar(k);
    }
    
    public int currentKey()
    {
        return this.root.i;
    }
    
    
    public void insertar(String k, ObjVehiculo objV)
    {
        if(root == null)
        {
            root = new nodoArbolB(t,true);
            root.keys[0] = k;
            root.objV[0] = objV;
            root.n = 1;
        }
        else
        {
            if(root.n == 2*t-1)
            {
                nodoArbolB s = new nodoArbolB(t,false);
                s.C[0] = root;
                s.separarHijo(0, root);
                
                int i = 0;
                if(s.keys[0].compareToIgnoreCase(k) < 0)
                    i++;
                s.C[i].insertarNoLleno(k, objV);
                
                root = s;
            }
            else  // si la raiz no esta llena solo insertarlo.
                root.insertarNoLleno(k, objV);
        }
        
    }

    public void update(nodoArbolB nodo, ObjVehiculo objV)
    {
        nodo.objV[currentKey()].setMarca(objV.getMarca());
        nodo.objV[currentKey()].setModelo(objV.getModelo());
        nodo.objV[currentKey()].setYear(objV.getYear());
        nodo.objV[currentKey()].setColor(objV.getColor());
        nodo.objV[currentKey()].setPrecio(objV.getPrecio());
        nodo.objV[currentKey()].setTrans(objV.getTrans());
    }
    
    
    
    //Graph outlined,
    public void graph() {
        String Coordenadas = "";
        String ListasCoordenadas = "";
        String CoordenadaAinicio = "";

        try {
            File fold = new File("tablaHash.txt");
            fold.delete();
        } catch (Exception e1) {

        }

        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("TablaHash.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);
            //Escribimos en el archivo con el metodo write 
            escribir.write("digraph { \r\n"
                    + "node[shape=box];\r\n"
                    + "rankdir=LR;\r\n \r\n \r\n"
                    + "subgraph cluster_1{ \r\n"
                    + Coordenadas + "\r\n }"
                    + "\r\n \r\n"
                    + ListasCoordenadas + " \r\n \r\n"
                    + CoordenadaAinicio + "\r\n \r\n }");
            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

        Runtime cmd = Runtime.getRuntime();
        String comando = "dot -Tpng TablaHash.txt -o TablaHash.png";
        try {
            cmd.exec(comando);
            //cmd.exec("start TablaHash.txt");
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
        }

        ReporteArbolB r = new ReporteArbolB();
        r.setImage("ArbolB.png");
        r.setVisible(true);
    }
}

