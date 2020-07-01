/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
/**
 *
 * @author luisa
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SE CREAN TODAS LAS ESTRUCTURAS QUE SERVIRAN EN EL FLUJO DE LA APLICACION
        
        TablaHash tablaClientes= new TablaHash(37);
        
        ListaConductor listaConductores = new ListaConductor();
        
        ArbolB arbolVehiculos = new ArbolB(5);
        
        ColaAdyacentes grafoRutas= new ColaAdyacentes();
        
        grafoRutas.GenerarGrafo();
        
        Chain registroViajes = new Chain();
        
        //SE INICIALIZA EL MENU ENVIANDOLE LAS ESTRUCTURAS
        MenuGeneral menu = new MenuGeneral();
        
        menu.setEstructuras(tablaClientes, listaConductores,arbolVehiculos,grafoRutas,registroViajes);
        
        menu.setVisible(true);
//        
////        Block test = new Block("PAAA");
////        System.out.println("Hora:" + test.getHoraFechaGenerado());
//        ListaTop t= new ListaTop();
//        t.InsertarTopViajes("", 98);
//        t.InsertarTopViajes("", 5);
//        t.InsertarTopViajes("", 20);
//        t.InsertarTopViajes("", 100);
//        t.InsertarTopViajes("", 30);
//        t.InsertarTopViajes("", 52);
//        t.Imprimir("top carros");
//        
        
    }
    
    
    
}
