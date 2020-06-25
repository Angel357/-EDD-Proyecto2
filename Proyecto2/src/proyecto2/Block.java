/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.math.BigInteger;
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
    private String placa;
    private Date fechaHora;
    
    private String hashMD5;
    
    
    public Block(String placa, Date fechaHora)
    {
        this.placa = placa;
        this.fechaHora = fechaHora;
        
        System.out.println("Fecha hora: " + fechaHora);
        String password = "123456";
        System.out.print("Md5: " + obtenerHash(password));
    }
    
    public String obtenerHash(String input)
    {
        String dataToHash = input;
        //String dataToHash = "" + this.getPlaca()  + this.getFechaHora();
        MessageDigest digest;
        String encoded = null;
        
        try{
            digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(dataToHash.getBytes());
            BigInteger number = new BigInteger(1,hash);
            String hashtext = number.toString(16);
            while(hashtext.length() < 32 )
                hashtext = "0" + hashtext;
            encoded = hashtext;
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace(); 
        }
        
        //this.setHash(encoded);
        return encoded;
    }
}
