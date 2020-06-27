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
public class NodeHuffman implements Comparable<NodeHuffman> {
    char character;
    int frequency;
    NodeHuffman leftChild;
    NodeHuffman rightChild;
    
    NodeHuffman(char character, int frequency, 
            NodeHuffman leftChild, NodeHuffman rightChild)
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
    public int compareTo(NodeHuffman t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Comparar Nodos
        int frequencyComp = Integer.compare(this.frequency, t.frequency);
        if(frequencyComp != 0)
            return frequencyComp;
        
        return Integer.compare(this.character, t.character);
    }
}
