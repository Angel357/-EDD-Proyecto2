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
        
        /*
        Chain test = new Chain();
        test.insertarFinal("P111AAA");
        test.insertarFinal("P111AAB");
        test.insertarFinal("P111AAC");
        test.insertarFinal("P111AAD");
        test.insertarFinal("P111AAE");
        test.insertarFinal("P111AAF");
        
        //test.printList();
        test.graph();*/

        /*
        ArbolB arbol = new ArbolB(5);
        MenuVehiculo mV = new MenuVehiculo();
        mV.setArbol(arbol);
        mV.setVisible(true);
        */
         /*
//          
          TablaHash t= new TablaHash(37);
          MenuCliente m= new MenuCliente();
          m.setHash(t); 
          m.setVisible(true);
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
          /*
          MenuVehiculo mV = new MenuVehiculo();
          mV.setArbol(arbol);
          mV.setVisible(true);*/
          
          ObjVehiculo insertar5 = new ObjVehiculo("f", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar5.getPlaca(), insertar5);
          ObjVehiculo insertar4 = new ObjVehiculo("e", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar4.getPlaca(), insertar4);
          ObjVehiculo insertar6 = new ObjVehiculo("g", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar6.getPlaca(), insertar6);
          ObjVehiculo insertar1 = new ObjVehiculo("b", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar1.getPlaca(), insertar1);
          ObjVehiculo insertarV = new ObjVehiculo("a", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertarV.getPlaca(), insertarV);
          /*
          ObjVehiculo insertar2 = new ObjVehiculo("c", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar2.getPlaca(), insertar2);
          ObjVehiculo insertar3 = new ObjVehiculo("d", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar3.getPlaca(), insertar3);
          ObjVehiculo insertar7 = new ObjVehiculo("h", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar7.getPlaca(), insertar3);
         ObjVehiculo insertar8 = new ObjVehiculo("i", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar8.getPlaca(), insertar3);
         ObjVehiculo insertar9 = new ObjVehiculo("j", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar9.getPlaca(), insertar3);
          ObjVehiculo insertar10 = new ObjVehiculo("k", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar10.getPlaca(), insertar3);
          ObjVehiculo insertar11 = new ObjVehiculo("l", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar11.getPlaca(), insertar3);
          ObjVehiculo insertar12 = new ObjVehiculo("m", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar12.getPlaca(), insertar3);
          ObjVehiculo insertar13 = new ObjVehiculo("n", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar13.getPlaca(), insertar3);
          ObjVehiculo insertar14 = new ObjVehiculo("o", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar14.getPlaca(), insertar3);
          ObjVehiculo insertar15 = new ObjVehiculo("p", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar15.getPlaca(), insertar3);
          arbol.imprimir();
          ObjVehiculo insertar16 = new ObjVehiculo("q", "Honda", "nose", "94", "rojo", "1500", "aut");
          arbol.insertar(insertar16.getPlaca(), insertar3);*/
         
         /*
        ListaConductor lista = new ListaConductor();
        MenuConductor mC = new MenuConductor();
        mC.setLista(lista);
        mC.setVisible(true);*/
        
        //primer commit
        
        //dot -Tpng graf.txt -o graf.png
        /*
        ListaConductor lista = new ListaConductor();
        Conductor one = new Conductor();
        Conductor two = new Conductor();
        Conductor three = new Conductor();
        Conductor four = new Conductor();
        Conductor five = new Conductor();
        
        one.setDpi(BigInteger.valueOf(50));
        two.setDpi(BigInteger.valueOf(10));
        three.setDpi(BigInteger.valueOf(30));
        four.setDpi(BigInteger.valueOf(80));
        five.setDpi(BigInteger.valueOf(50));
          
        //ListaConductor lista = new ListaConductor();
        
        lista.insertarFinal(two);
        lista.insertarFinal(one);
        lista.insertarFinal(three);
        lista.insertarFinal(four);
        lista.insertarFinal(five);
        
        lista.imprimir();
        */
        //lista.imprimir();
        /*
        System.out.println("Se econtro: " + lista.buscar(BigInteger.valueOf(20)).data.getDpi());
        //System.out.println("Se econtro: " + lista.buscar(BigInteger.valueOf(50)).data.getDpi());
        
        try
        {
            if(lista.buscar(BigInteger.valueOf(200)).data==null){
            System.out.println("No existe");
        }else{
            System.out.println("Se econtro: " + lista.buscar(BigInteger.valueOf(100)).data.getDpi());
        }
        }catch(Exception e){}*/
    }
    
}
