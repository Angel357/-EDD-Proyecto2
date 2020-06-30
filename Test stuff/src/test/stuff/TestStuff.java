/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stuff;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class TestStuff {
    
    public static void main(String[] args) {
        ArbolB test = new ArbolB(5);
        
        test.insertar("A");
        test.insertar("B");
        test.insertar("C");
        test.insertar("D");
        test.insertar("E");
        test.insertar("F");
        test.insertar("G");
        test.insertar("H");
        test.insertar("I"); // Break
        test.insertar("J");
        test.insertar("K");
        test.insertar("L");
        test.insertar("M");
        test.insertar("N");
        test.insertar("O");
        test.insertar("P");
        test.insertar("Q");
        test.insertar("R");// break
        test.insertar("S");
        test.insertar("T");
        test.insertar("W");
        test.insertar("X");
        test.insertar("Y");
        test.insertar("Z");
        test.insertar("ZA");
        
        test.imprimir();
    }

    
}
