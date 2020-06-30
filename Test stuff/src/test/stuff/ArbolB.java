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
public class ArbolB {

    public nodoArbolB root;
    public int t;
    String gHijos[]; // hijos
    int h; // numero de hijos

    ArbolB(int t) {
        this.root = null;
        this.t = t;
        this.gHijos = new String[20];
        this.h = 0;
    }

    public void imprimir() {
        
        if (this.root != null) {
            this.root.imprimir(1);
            this.root.getGraph();
        }
    }

    public nodoArbolB buscar(String k) {
        if (this.root == null) {
            return null;
        } else {
            return this.root.buscar(k);
        }
        
    }

    public int currentKey() {
        return this.root.i;
    }

    public void insertar(String k) {
        if (root == null) {
            root = new nodoArbolB(t, true);
            root.keys[0] = k;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                nodoArbolB s = new nodoArbolB(t, false);
                s.C[0] = root;
                s.separarHijo(0, root);

                int i = 0;
                if (s.keys[0].compareToIgnoreCase(k) < 0) {
                    i++;
                }
                s.C[i].insertarNoLleno(k);

                root = s;
            } else // si la raiz no esta llena solo insertarlo.
            {
                root.insertarNoLleno(k);
            }
        }

    }
    
}
