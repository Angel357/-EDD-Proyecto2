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
public class nodoArbolB {

    String[] keys;  // llaves
    // Objetos tipo Vehiculo
    int t;  // grado
    nodoArbolB[] C; // arreglo de punteros hijos
    int n; // total de nodos
    boolean hoja;  // verificar si es hoja

    /// Cosas de grafica
    FileWriter escribir;
    File archivo;

    nodoArbolB(int t, boolean hoja) {
        this.t = t;
        this.hoja = hoja;
        this.keys = new String[2 * t - 1];
        //this.keys = new String[t-1];
        this.C = new nodoArbolB[2 * t];
        this.n = 0;
    }

    
    // Mostrar arbol traverse
    public void imprimir(int counter) {
        String test = "";
        int i = 0;
        if (this.hoja == true) {
            //hijos = hijos +  "<";
            System.out.print("node" +counter++ + "[label=\"|");
        }
        for (i = 0; i < this.n; i++) {
            if (this.hoja == false) {
                test += keys[i];
                C[i].imprimir(counter++);
            } else {
                System.out.print(keys[i] + "|" + "f<" + i + ">|");
            }

        }

        if (this.hoja == true) {
            System.out.print("\"];" + "\r\n");
            counter--;
            System.out.println("node0->"  + "node"+ counter-- + "\r\n");
        }
        if (hoja == false) {
            C[i].imprimir(counter++);
            System.out.println("test" + test);
        }
    }
    
    public void getGraph()
    {    
        try{
        archivo = new File("arbol.txt");
        if (archivo.exists()) {
                archivo.delete();
                try {
                    archivo.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        //--------------------------------------- Cabecera
        escribir = new FileWriter(archivo, true);
        escribir.write("digraph {\r\n");
        escribir.write("node[shape=record, height = 0.3];\r\n");
        // Mostrar raiz
        int i = 0;
        escribir.write("node0[label=\"");
        while(this.keys[i]!=null){
            escribir.write(this.keys[i]);
            i++;
        }
        escribir.write("\"];"+"\r\n");
        escribir.close();
        
        
        // Body
        getDot(1);
        
        // Cerrar
        archivo = new File("arbol.txt");
        escribir = new FileWriter(archivo, true);
        escribir.write("\r\n}");
        escribir.close();
        }catch(Exception e){
            System.out.println("error");
        }
        
        Runtime cmd = Runtime.getRuntime();
        String comando = "dot -Tpng arbol.txt -o arbol.png";
        try {
            cmd.exec(comando);
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
        }
    }
    
    public void getDot(int counter) {
        try {

            archivo = new File("arbol.txt");

            escribir = new FileWriter(archivo, true);

            String test = "";
            int i = 0;
            if (this.hoja == true) {
                escribir.write("node" + counter++ + "[label=\"");
            }
            for (i = 0; i < this.n; i++) {
                if (this.hoja == false) {

                    test += keys[i];
                    C[i].getDot(counter++);
                } else {
                    escribir.write("<f" + i + ">|" + keys[i] + "|");
                }
            }

            if (this.hoja == true) {
                escribir.write("\"];" + "\r\n");
                counter--;
                escribir.write("node0->" + "node" + counter-- + "\r\n");
            }
            if (hoja == false) {
                C[i].getDot(counter++);
                //escribir.write("\r\n" + test);
            }
            //escribir.write(" }\r\n");

            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

    /// graph outline
    // Buscar algun nodo, regresa nulo si no existe
    int i=0; // para obtener nodo buscado
    nodoArbolB buscar(String k) {
        i = 0;
        while (i < n && k.compareToIgnoreCase(keys[i]) > 0) {
            i++;
        }
        try {
            if (keys[i].compareToIgnoreCase(k) == 0) {
                setCurrentKey(i);
                return this;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (hoja == true) {
            return null;
        }

        return C[i].buscar(k);
    }

    // Para accesar la llave actual.
    public void setCurrentKey(int i) {
        this.i = i;
    }

    public void insertarNoLleno(String k) {
        int i = n - 1;

        // si es hoja
        if (hoja == true) {
            while (i >= 0 && keys[i].compareToIgnoreCase(k) > 0) {
                keys[i + 1] = keys[i];
                i--;
            }
            keys[i + 1] = k;
            n++;
        } else // si no es hoja
        {
            while (i >= 0 && keys[i].compareToIgnoreCase(k) > 0) {
                i--;
            }

            if (C[i + 1].n == 2 * t - 1) {
                separarHijo(i + 1, C[i + 1]);

                if (keys[i + 1].compareToIgnoreCase(k) < 0) {
                    i++;
                }
            }
            C[i + 1].insertarNoLleno(k);
        }

    }

    public void separarHijo(int i, nodoArbolB y) {
        nodoArbolB z = new nodoArbolB(y.t, y.hoja);
        z.n = t - 1;

        // Copia datos z [0] z[4] ultimos datos
        for (int j = 0; j < t - 1; j++) {
            z.keys[j] = y.keys[j + t];
        }

        if (y.hoja == false) {
            for (int j = 0; j < t; j++) {
                z.C[j] = y.C[j + t];
            }
        }
        y.n = t - 1;

        for (int j = n; j >= i + 1; j--) {
            C[j + 1] = C[j];
        }

        C[i + 1] = z;

        for (int j = n - 1; j >= i; j--) {
            keys[j + 1] = keys[j];
        }

        keys[i] = y.keys[t - 1];

        n = n + 1;
    }
}
