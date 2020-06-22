/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

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
      
//        TablaHash t=new TablaHash(37);
//        MenuCliente m=new MenuCliente();
//        m.setHash(t);
//        m.setVisible(true);
        BigInteger dpi=new BigInteger("3002875340101");
        BigInteger mod=new BigInteger("37");
        System.out.println(dpi.mod(mod));
        
        
        //primer commit
    }
    
}
