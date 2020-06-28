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
public class ResultadoH {
        NodoHuffman root;
    String encryptedData;

    ResultadoH(String encryptedData, NodoHuffman root) {
        this.root = root;
        this.encryptedData = encryptedData;
    }

    public NodoHuffman getRoot() {
        return this.root;
    }

    public String getEncryptedData(){
        return this.encryptedData;
    }
}
