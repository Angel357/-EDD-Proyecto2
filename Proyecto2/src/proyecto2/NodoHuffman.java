/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author wilson
 */
public class NodoHuffman implements Comparable<NodoHuffman>{
    char character;
    int frequency;
    NodoHuffman leftChild;
    NodoHuffman rightChild;
    
    NodoHuffman(char character, int frequency, 
            NodoHuffman leftChild, NodoHuffman rightChild)
    {
        this.character = character;
        this.frequency = frequency;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    boolean esHoja()
    {
        return this.leftChild == null && this.rightChild == null;
    }

    @Override
    public int compareTo(NodoHuffman t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Comparar Nodos
        int frequencyComp = Integer.compare(this.frequency, t.frequency);
        if(frequencyComp != 0)
            return frequencyComp;
        
        return Integer.compare(this.character, t.character);
    }
}
