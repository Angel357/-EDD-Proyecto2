/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.stuff;

import java.util.PriorityQueue;

/**
 *
 * @author wilson
 */
public class CompresionHuffman {
    
    private final int alfabeto = 256; /// ASCCI tiene 256 CARACTERES
    // Metodo para comprimir
    public ResultadoDeCompresion comprimir(String data)
    {
        int[] freq = construirTablaFrequencia(data);
        NodeHuffman root = constuirArbolHuffman(freq);
        return null;
    }
    
    // construir tabla
    public NodeHuffman constuirArbolHuffman(int[] freq)
    {
         // verificar si tengo que hacer mi propia priorityQueue;
        PriorityQueue<NodeHuffman> priorityQueue = new PriorityQueue<>();
        
        for(char i = 0; i < alfabeto;i++)
        {
            if(freq[i] > 0){
                priorityQueue.add(new NodeHuffman(i, freq[i],null,null));
            }
        }
        
        if( priorityQueue.size() == 1)
        {
            priorityQueue.add(new NodeHuffman('\0',1,null, null));
        }
        
        while(priorityQueue.size() > 1)
        {
            NodeHuffman left = priorityQueue.poll();
            NodeHuffman right = priorityQueue.poll();
            NodeHuffman parent = new NodeHuffman('\0',left.frequency + right.frequency, left, right);
            priorityQueue.add(parent);
        }
        
        return priorityQueue.poll();
    }
    
    public int[] construirTablaFrequencia(String data)
    {
        int [] freq = new int[alfabeto];
        for(char caracter : data.toCharArray())
            freq[caracter]++;
        return freq;
    }
    
    // Metodo para descomprimir
    public String decompress(ResultadoDeCompresion resultado)
    {
        return null;
    }
    
    
}
