package proyecto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wilson
 */
//estructuras



public class Chain {
    //estructuras
    TablaHash estructuraClientes;
    ListaConductor estructuraConductores;
    ArbolB estructuraVehiculos;
    ColaAdyacentes estructuraRuta;
    
    
    Block start;
    
    public Chain()
    {
        this.start = null;
    }
    
    public void setEstructuras(TablaHash estructuraClientes,ListaConductor estructuraConductores, ArbolB estructuraVehiculos, ColaAdyacentes estructuraRuta){
        this.estructuraClientes=estructuraClientes;
        this.estructuraConductores=estructuraConductores;
        this.estructuraVehiculos=estructuraVehiculos;
        this.estructuraRuta=estructuraRuta;
    }
    
    public void insertarFinal(String placa){
        Block newBlock = new Block(placa,estructuraClientes, estructuraConductores, estructuraVehiculos, estructuraRuta);
        //newBlock.next = null;
        
        // verificar si esta vacia
        if(start == null){
            start = newBlock;
        }else{
            Block auxFin = start;
            //llegar al ultimo
            while(auxFin.next != null)
                auxFin = auxFin.next;
                
            // insertar
            auxFin.next = newBlock;
            newBlock.prev = auxFin;
        }
    }
    
    public void printList()
    {
        Block current = start;
        
        System.out.println("*** Block Chain ***");
        while(current != null)
        {
            System.out.println(current.getKey() + "->");
            current = current.getNext();
        }   
    }
    
    
    // graphing stuff
    public void graph(){ getDot(start); }
    
        public void getDot(Block n)
    {
        Block aux = n;

        String label;
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("graphBlock.dot");
            
            if(archivo.exists())
            {
                archivo.delete();
                try{
                    archivo.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            
            FileWriter escribir = new FileWriter(archivo, true);
            
            //Escribimos en el archivo con el metodo write 
            // setting the una lista doble;
            escribir.write("digraph {\r\n");
            escribir.write("node[shape=box];\r\n");
            escribir.write("rankdir=LR;\r\n");
            // Dibujar nodos y links
            
         /*
            System.out.println(current.getKey() + "->");
            current = current.getNext();
          */
                String link="";
                String linkPrev="";
         
                linkPrev = "\"" + aux.key + "\" -> \"" + "NULL"  + "\"; \r\n";
                escribir.write(linkPrev);
            while(aux != null)
            {
                
                // Cuando no hay datos cargados borra todo, porque es null
                label = "\"" + aux.key + "\" \r\n";
                escribir.write(label);

                
                if(aux.next != null){
                    link = "\"" + aux.key + "\" -> \"" + aux.next.key  + "\"; \r\n";
                    linkPrev = "\"" + aux.next.key + "\" -> \"" + aux.key  + "\"; \r\n";
                }else
                {
                    //String auxT + "\""  "\" \r\n";
                    link = "\"" + aux.key + "\" -> \"" + "NULL.\"; " + "\r\n";
                            //+ "\"" + start.key + "\" ->" + "\"NULL\"" ;
                    
                }
                    
                //link = link + aux.getKey() + "->" + aux.prev.data.getDpi() + "\r\n";
                escribir.write(link);
                escribir.write(linkPrev);
                aux = aux.next;
            }

            
            escribir.write(" }\r\n");
            
            //Cerramos la conexion
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }

        Runtime cmd = Runtime.getRuntime();
        String comando = "dot -Tpng graphBlock.dot -o graphBlock.png";
        try {
            cmd.exec(comando);
            //cmd.exec("start .\\graphListaC.txt");
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
        }
        
        //Pausar antes de mostrar
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            
        }
    }
    
    
    public void GraficaGeneral(){
        Block aux=start;
        
        try{
              File fold=new File("GraficaGeneral.txt");
                fold.delete();
          }catch(Exception e1){
              
          }
          
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("GraficaGeneral.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);
            //Escribimos en el archivo con el metodo write 
            escribir.write("digraph {\r\n");
            escribir.write("subgraph cluster_Grafo{\r\n");
            escribir.write(estructuraRuta.g.GraficoGeneral);
            escribir.write("\r\n}");
            
            escribir.write("\r\n }");
            //Cerramos la conexion
            escribir.close();
            } //Si existe un problema al escribir cae aqui
            catch (Exception e) {
                System.out.println("Error al escribir");
            }
        
            Runtime cmd=Runtime.getRuntime();
            String comando="dot -Tpng GraficaGeneral.txt -o GraficaGeneral.png";
            try{
                cmd.exec(comando);
                //cmd.exec("start TablaHash.txt");
            }catch(Exception ex){
                System.out.println("ex: "+ex.getMessage());
            }

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }

                ReporteHash r=new ReporteHash();
                r.setImagen("GraficaGeneral.png");
                r.setVisible(true);
            }    
    
}// fin clase chain
