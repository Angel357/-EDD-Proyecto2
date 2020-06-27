/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stuff;

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
        CompresionHuffman hola = new CompresionHuffman();
        String test = "abcdeffg";
        int[] ft = hola.construirTablaFrequencia(test);
        NodeHuffman n  = hola.constuirArbolHuffman(ft);
         
        System.out.println(n);
        /*
        for(int i = 0; i < ft.length; i++)
        {
            System.out.print( i + " ");
            System.out.println(ft[i]);
        }*/
            
        
        
    }
    
}
