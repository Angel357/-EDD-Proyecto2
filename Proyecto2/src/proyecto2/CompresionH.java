/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author wilson
 */
public class CompresionH {
        private final int alfabeto = 256; /// ASCCI tiene 256 CARACTERES
    
    // Metodo para comprimir
    public ResultadoH comprimir(String data)
    {
        int[] freq = construirTablaFrequencia(data);
        NodoHuffman root = constuirArbolHuffman(freq);
        Map<Character, String> tablaB = buscarTabla(root);
        return new ResultadoH(generarCodigo(data,tablaB), root);
    }
    public String generarCodigo(String data, Map<Character, String> tablaB)
    {
        StringBuilder generar = new StringBuilder();
        
        for(char character: data.toCharArray())
            generar.append(tablaB.get(character));
        
        return generar.toString();
    }
    
    public void impConstruirTabla(NodoHuffman nodo, 
            String s, 
            Map<Character, String> tablaBuscar){
        if(!nodo.esHoja()){
            impConstruirTabla(nodo.leftChild, s +'0',tablaBuscar);
            impConstruirTabla(nodo.rightChild,s + '1', tablaBuscar);
        }else
        {
            tablaBuscar.put(nodo.character, s);
        }
        
    }
    
    public Map<Character, String> buscarTabla(NodoHuffman root)
    {
        Map<Character, String> tablaBuscar = new HashMap<>();
        impConstruirTabla(root,"", tablaBuscar);
        return tablaBuscar;
    }
    
    // construir tabla
    public NodoHuffman constuirArbolHuffman(int[] freq)
    {
         // verificar si tengo que hacer mi propia priorityQueue;
        PriorityQueue<NodoHuffman> priorityQueue = new PriorityQueue<>();
        
        for(char i = 0; i < alfabeto;i++)
        {
            if(freq[i] > 0){
                priorityQueue.add(new NodoHuffman(i, freq[i],null,null));
            }
        }
        
        if( priorityQueue.size() == 1)
        {
            priorityQueue.add(new NodoHuffman('\0',1,null, null));
        }
        
        while(priorityQueue.size() > 1)
        {
            NodoHuffman left = priorityQueue.poll();
            NodoHuffman right = priorityQueue.poll();
            NodoHuffman parent = new NodoHuffman('\0',left.frequency + right.frequency, left, right);
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
    
    // -------------------------------------------Metodo para descomprimir
    public String decompress(ResultadoH resultado)
    {
        StringBuilder resultadoDec = new StringBuilder();
        NodoHuffman current = resultado.getRoot();
        int i = 0;
        while(i < resultado.getEncryptedData().length()){
            while(!current.esHoja()){
                char bit = resultado.getEncryptedData().charAt(i);
                if(bit == '1'){
                    current = current.rightChild;
                }else if(bit == '0'){
                    current = current.leftChild;
                }else{
                    throw new IllegalArgumentException("bit no valido" + bit);
                }
                i++;
            }
            resultadoDec.append(current.character);
            current = resultado.getRoot();
        }
        
        return resultadoDec.toString();
    } 
}
