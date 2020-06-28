/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stuff;

import java.util.Map;

/**
 *
 * @author wilson
 */
public class TestStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolB test = new ArbolB(3);
        test.insertar("A");
        test.insertar("B");
        test.insertar("C");
        test.insertar("D");
        test.insertar("E");
        test.insertar("F");
        test.insertar("G");
        test.insertar("H");
        test.insertar("I");
        test.insertar("J");
        test.insertar("K");
        
        test.imprimir();
    }
    
}
