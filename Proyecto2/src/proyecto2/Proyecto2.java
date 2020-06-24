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
          
        //primer commit
        
        
        //dot -Tpng graf.txt -o graf.png
          
          
    }
    
}
