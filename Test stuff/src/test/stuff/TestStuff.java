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
        String data = "hello world!";
        CompresionH codificador = new CompresionH();
        ResultadoH resultado = codificador.comprimir(data);
        
        System.out.println("codificado: " + resultado.encryptedData);
        System.out.println("decodificado: " + codificador.decompress(resultado));
        
        /*
        int[] ft = hola.construirTablaFrequencia(test);
        NodeHuffman n  = hola.constuirArbolHuffman(ft);
        Map<Character, String> buscar = hola.buscarTabla(n);
         */
        /*
        for(int i = 0; i < ft.length; i++)
        {
            System.out.print( i + " ");
            System.out.println(ft[i]);
        }*/
            
        
        
    }
    
}
