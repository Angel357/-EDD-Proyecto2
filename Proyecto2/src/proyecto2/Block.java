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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author wilson
 */
public class Block {
    // key stuff
    String key;
    Block next;
    Block prev;
    
    ListaConductor conductores;
    TablaHash clientes;
    Ruta recorrido;
    ArbolB  vehiculos;
    
    public Block(String placa)
    {
        this.key = obtenerHash(formatKey(placa));
        next = null;
        prev = null;
    }
    
    //Formatear la llave PLACADDMMYYHH:MM
    public String formatKey(String placa)
    {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter fechaFormat = DateTimeFormatter.ofPattern("ddMMyy HH:mm");
        String formatedDate = fechaHora.format(fechaFormat).trim().replace(" ", "").toUpperCase();
    
        System.out.println("Fecha hora: " + placa + formatedDate);
        return placa + formatedDate;
    }
    
    // MD5 llave
    public String obtenerHash(String input)
    {
        String dataToHash = input;
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

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the next
     */
    public Block getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Block next) {
        this.next = next;
    }
}
