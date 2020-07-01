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
//estructuras    
    TablaHash estructuraClientes;
    ListaConductor estructuraConductores;
    ArbolB estructuraVehiculos;
    ColaAdyacentes estructuraRuta;
    Ruta estructuraRutaCorta;

    //variables
    String OrigenSeleccionado;
    String DestinoSeleccionado;
    String ClienteSeleccionado;
    String ConductorSeleccionado;
    String VehiculoSeleccionado;
    
// key stuff
    String key;
    public String horaFechaGenerado;
    public String placa;
    Block next;
    Block prev;
    boolean verificado;
    
    public int index;
    
    public Block(String placa)
    {
        this.placa=placa;
        this.key = obtenerHash(formatKey(placa));
        next = null;
        prev = null;
       // System.out.println("Tiempo: " + this.horaFechaGenerado);
        
    }
    
    public Block(String placa,TablaHash estructuraClientes,ListaConductor estructuraConductores, ArbolB estructuraVehiculos, ColaAdyacentes estructuraRuta,String OrigenSeleccionado, String DestinoSeleccionado, String ClienteSeleccionado,
                             String ConductorSeleccionado, String VehiculoSeleccionado, Ruta estructuraRutaCorta, int index)
    {
        this.verificado=false;
        this.placa=placa;
        this.key = obtenerHash(formatKey(placa));
        next = null;
        prev = null;
        this.estructuraClientes=estructuraClientes;
        this.estructuraConductores=estructuraConductores;
        this.estructuraVehiculos=estructuraVehiculos;
        this.estructuraRuta=estructuraRuta;
        this.OrigenSeleccionado=OrigenSeleccionado;
        this.DestinoSeleccionado=DestinoSeleccionado;
        this.ClienteSeleccionado=ClienteSeleccionado;
        this.ConductorSeleccionado=ConductorSeleccionado;
        this.VehiculoSeleccionado=VehiculoSeleccionado;
        this.estructuraRutaCorta=estructuraRutaCorta;
        this.index=index;
    }
    
    public String getHoraFechaGenerado(){
        return this.horaFechaGenerado;
    }
    
    public String obtenerHash(String placa, String fechaViaje)
    {
        String decrypt = obtenerHash(placa+fechaViaje);
        return decrypt;
    }
    
    //Formatear la llave PLACADDMMYYHH:MM
    public String formatKey(String placa)
    {
        String formatedDate = formatDTime();
        this.horaFechaGenerado = formatedDate;
        System.out.println("Fecha hora: " + placa + formatedDate);
        return placa + formatedDate;
    }
    
    public String formatDTime()
    {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter fechaFormat = DateTimeFormatter.ofPattern("ddMMyy HH:mm:ss");
        String formatedDate = fechaHora.format(fechaFormat).trim().replace(" ", "").toUpperCase();
        return formatedDate;
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
    
    public String getPlaca(){
        return placa;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Block next) {
        this.next = next;
    }
    
    
}
