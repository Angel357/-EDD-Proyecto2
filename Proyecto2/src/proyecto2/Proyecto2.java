/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
/**
 *
 * @author luisa
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
          TablaHash t= new TablaHash(37);
          MenuCliente m= new MenuCliente();
          m.setHash(t); 
          m.setVisible(true);
          
//          ArbolB arbol = new ArbolB(5);
//          MenuVehiculo mV = new MenuVehiculo();
//          mV.setArbol(arbol);
//          mV.setVisible(true);
          
//       
                    
//          try {
//            Scanner input = new Scanner(new File("/ruta/filename.txt"));
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                System.out.println(line);
//            }
//            input.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//         public void setImagen(String imagen)
//    {
//        ImageIcon im = new ImageIcon(imagen);
//        ImageIcon estructura = new ImageIcon(im.getImage());
//        lblReporte.setIcon(estructura);
//        
//        this.lblReporte.repaint();
//    }
      
//        int h=5;
//        TablaHash t=new TablaHash(h);
//        t.Insertar("3", "angel", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("1", "juan", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("39", "pedro", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("40", "mario", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("41", "mario", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("32652515", "mario", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("56", "mario", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("85", "mario", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("25", "mario", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("69", "marioelpopeye", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("3966515", "juan", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("3966962515", "pedro", "castellanos", "fajardo", "45151851", "11 calle");
//        t.Insertar("39665762515", "maciel", "castellanos", "fajardo", "45151851", "11 calle");
//        t.imprimir();
        
        /*
          TablaHash t= new TablaHash(37);
          MenuCliente m= new MenuCliente();
          m.setHash(t); 
          m.setVisible(true);
          */
        
          ArbolB arbol = new ArbolB(5);
          MenuVehiculo mV = new MenuVehiculo();
          mV.setArbol(arbol);
          mV.setVisible(true);
          
        //primer commit
        
        
        //dot -Tpng graf.txt -o graf.png
          
          
    }
    
}
