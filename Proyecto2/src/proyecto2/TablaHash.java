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
public class TablaHash {
    public int size;
    public int porcentajeDispersion=(int)(size*0.75);
    public int contadorHash;
    NodoHash[] arregloHash;
    
    public TablaHash(int size)
    {
        this.size=size;
        this.arregloHash=new NodoHash[size];
    }
    
    public void Insertar(String DPI, String Nombre, String Apellido, String Genero, String Telefono, String Direccion){
        if(contadorHash<=porcentajeDispersion)
        {
            BigInteger  dpi= new BigInteger(DPI);
            int coordenada = dpi.mod(BigInteger.valueOf(size)).intValue();
          //determinar en que indice se insertara utilizando como llave el dpi  
          
          if(arregloHash[coordenada].ListaClientes==null)
          {
              //se crea una nueva lista para el nodo en la coordenada ya antes ubicada
              ListaSimple ls=new ListaSimple();
              //se inserta el nuevo cliente en la lista de clientes
              ls.Insertar(DPI, Nombre, Apellido, Genero, Telefono, Direccion);
              //se crea el nuevo nodo que es el que insertaremos en la coordenada del arreglo de nodos
              NodoHash Nuevo = new NodoHash(ls, coordenada);
              //se inserta el nuevo nodo en la coordenada obtenida, dejando asi en esa coordenada un nodo que cuenta con su coodenada como atributo asi como la insercion del nodo 
              arregloHash[coordenada]=Nuevo;
              contadorHash++;
          }
          else
          {
             ListaSimple L=arregloHash[coordenada].getListaClientes();
             L.Insertar(DPI, Nombre, Apellido, Genero, Telefono, Direccion);
          }
          
        }
        else
        {
            //codigo para hacer rehashing si el porcentaje de dispersion esn superado 
            //se creaa un lista auxiliar donde todos los datos de la tabla hash seran guardados 
            ListaAuxiliarHash lAUX=new ListaAuxiliarHash();
            for(int x=0;x<size;x++)
            {
                //se verifica que cada posicion del arreglo de la tabla hash tenga ya registrada una lista clientes
                //de ser asi la recorre y obtiene cada uno de los tributos de sus nodos y los inserta en un nodo de la lista auxiliar
                if(arregloHash[x].ListaClientes!=null)
                {
                   ListaSimple l=arregloHash[x].getListaClientes();
                   NodoLS aux=l.Inicio;
                   while(aux!=null)
                   {
                       lAUX.Insertar(aux.DPI, aux.Nombre, aux.Apellido, aux.Genero, aux.Telefono, aux.Direccion);
                       aux=aux.siguiente;
                   }
                }
            }
            //luego de almacenar todos los datos en una lista auxiliar 
            //se crea una nueva tabla hash 
            //con el nuevo tamaño que seria size*2
            //y se insertan nuevamente todos los registros almacenados en la lista auxiliar en la nueva tabla hash
            size=size*2;
            NodoHash[] nuevo=new NodoHash[size];
            arregloHash=nuevo;
            //TablaHash nueva=new TablaHash();
            //se recorre la lista auxiliar hasta el ultimo registro 
            //y se va haciendo la insercion
            
            NodoLAH aux2= lAUX.Inicio;
            while(aux2!=null)
            {
                Insertar(aux2.DPI, aux2.Nombre, aux2.Apellido, aux2.Genero, aux2.Telefono, aux2.Direccion);
                aux2=aux2.siguiente;
            }
        }
      
        
        
        
    }
    

    public NodoHash[] getArregloHash() {
        return arregloHash;
    }
    
    public void imprimir(){
        for(int x=0;x<size;x++)
        {
            if(arregloHash[x].ListaClientes.Inicio!=null)
            {
                NodoLS aux=arregloHash[x].ListaClientes.Inicio;
                System.out.println("Usuarios registrados en coordenada: "+x);
                while(aux!=null)
                {
                    System.out.println(aux.DPI+"; "+aux.Nombre+"; "+aux.Apellido+"; "+aux.Genero+"; "+aux.Telefono+"; "+aux.Direccion);
                    aux=aux.siguiente;
                }
                
            }
        }
    }
    
    
    
    
}
