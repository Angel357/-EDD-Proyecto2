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
      
        TablaHash t=new TablaHash(37);
        MenuCliente m=new MenuCliente();
        m.setHash(t);
        m.setVisible(true);
//        String numero="3002875340101";
//        BigInteger dpi=new BigInteger(numero);
//        BigInteger mod=new BigInteger("37");
//        int num= dpi.mod(mod).intValue();
//        System.out.println(num);ssss
        
        
        //primer commit
    }
    
}
