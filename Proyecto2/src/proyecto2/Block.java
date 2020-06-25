/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;

/**
 *
 * @author wilson
 */
public class Block {
    private String version;
    private Date fechaHora;
    private String hash;
    private String hashAnterior;
    private String data;
    
    public Block(String version, Date fechaHora, String data)
    {
        this.version = version;
        this.fechaHora = fechaHora;
        this.data = data;
        this.hash = obtenerHash();
    }
    
    public String obtenerHash()
    {
        String dataToHash = ""  + this.getVersion() + this.getFechaHora() + this.getHashAnterior() + this.getData();
        MessageDigest digest;
        String encoded = null;
        
        try{
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
            encoded = Base64.getEncoder().encodeToString(hash);
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace(); 
        }
        
        this.setHash(encoded);
        return encoded;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the fechaHora
     */
    public Date getFechaHora() {
        return fechaHora;
    }

    /**
     * @param fechaHora the fechaHora to set
     */
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash the hash to set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * @return the hashAnterior
     */
    public String getHashAnterior() {
        return hashAnterior;
    }

    /**
     * @param hashAnterior the hashAnterior to set
     */
    public void setHashAnterior(String hashAnterior) {
        this.hashAnterior = hashAnterior;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}
