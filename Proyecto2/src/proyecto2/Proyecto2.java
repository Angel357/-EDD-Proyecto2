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
        ArbolB test = new ArbolB(5);
        ColaAdyacentes grafoRutas= new ColaAdyacentes();
        grafoRutas.GenerarGrafo();
        Chain registroViajes = new Chain();
        
        //SE INICIALIZA EL MENU ENVIANDOLE LAS ESTRUCTURAS
        MenuGeneral menu = new MenuGeneral();
        menu.setEstructuras(tablaClientes, listaConductores,test,grafoRutas,registroViajes);
        menu.setVisible(true);
        
        //ArbolB test = new ArbolB(5);
        ObjVehiculo a  = new ObjVehiculo("PAA", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo b  = new ObjVehiculo("PAB", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo c  = new ObjVehiculo("PAC", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo d  = new ObjVehiculo("PAD", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo e  = new ObjVehiculo("PAE", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo f  = new ObjVehiculo("PAF", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo g  = new ObjVehiculo("PAG", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo h  = new ObjVehiculo("PAH", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo i  = new ObjVehiculo("PAI", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo j  = new ObjVehiculo("PAJ", "honda", "nose", "1995", "black","1500","automatico");
        ObjVehiculo k  = new ObjVehiculo("PAK", "honda", "nose", "1995", "black","1500","automatico");
        
        test.insertar("PAA", a);
        test.insertar("PAB", b);
        test.insertar("PAC", c);
        test.insertar("PAD", d);
        test.insertar("PAE", e);
        test.insertar("PAF", f);
        test.insertar("PAG", g);
        test.insertar("PAH", h);
        test.insertar("PAI", i);
        test.insertar("PAJ", j);
        test.insertar("PAK", k);
        
        //test.imprimir();
        //test.graph();
        
        
    }
    
    
    
}
