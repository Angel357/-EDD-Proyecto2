/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.math.BigInteger;
import javax.swing.JOptionPane;
/**
 *
 * @author luisa
 */
public class TablaHash {
    int size;
    public int porcentajeDispersion;
    public int contadorHash;
    NodoHash[] arregloHash;
    
    public TablaHash(int size)
    {
      contadorHash=0;
      //3002875340101
      setDatos(size);
    }
    
    public void Insertar(String DPI, String Nombre, String Apellido, String Genero, String Telefono, String Direccion,int masiva){
   
        try{
            BigInteger  dpi= new BigInteger(DPI);
            int coordenada = dpi.mod(BigInteger.valueOf(size)).intValue();
          //determinar en que indice se insertara utilizando como llave el dpi  
        
          if(arregloHash[coordenada]==null)
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
              if(masiva==0){
                  JOptionPane.showMessageDialog(null, "se registro el cliente: "+Nombre);
              }
             
              VerificarDispersion();
          }
          else
          {
             ListaSimple L=arregloHash[coordenada].getListaClientes();
             L.Insertar(DPI, Nombre, Apellido, Genero, Telefono, Direccion);
             JOptionPane.showMessageDialog(null, "se registro el cliente: "+Nombre);
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "esta intentando agregar letras al DPI, ingrese solo numeros");
        }
    }
    
    public void VerificarDispersion()
    {
        if(contadorHash>porcentajeDispersion)
        {
         TablaHash nueva=new TablaHash(size*2);
         for(int x=0;x<size;x++)
            {
                if(arregloHash[x]!=null)
                {
                    NodoLS aux=arregloHash[x].ListaClientes.Inicio;
                    while(aux!=null)
                    {
                        nueva.Insertar(aux.DPI, aux.Nombre, aux.Apellido, aux.Genero, aux.Telefono, aux.Direccion,1);

                        aux=aux.siguiente;
                    }
                }
            }
         setDatos(size*2);
         arregloHash=nueva.arregloHash;
         
        }
    }
    
    public void setDatos(int size)
    {
        this.size=size;
        arregloHash=new NodoHash[size];
        porcentajeDispersion=(int)(size*0.75);
        
    }
    
    public NodoLS Buscar(String DPI){
     
        try
        {
        BigInteger  dpi= new BigInteger(DPI);
        int coordenada = dpi.mod(BigInteger.valueOf(size)).intValue();
            if(arregloHash[coordenada]!=null)
            {
                NodoLS aux=arregloHash[coordenada].ListaClientes.Inicio;
                while(aux!=null)
                {
                   if(DPI.equals(aux.DPI)){
                       System.out.println(aux.DPI);
                       return aux;
                   }
                    
                    aux=aux.siguiente;
                }
            }
            
            
        }catch(Exception e2)
        {
           JOptionPane.showMessageDialog(null, "esta intentando agregar letras al DPI, ingrese solo numeros"); 
        }
        return null;
    }
    
    public void Modificar(String DPI, String Nombre, String Apellido, String Genero, String Telefono, String Direccion) {
         try
        {
        BigInteger  dpi= new BigInteger(DPI);
        int coordenada = dpi.mod(BigInteger.valueOf(size)).intValue();
            if(arregloHash[coordenada]!=null)
            {
                NodoLS aux=arregloHash[coordenada].ListaClientes.Inicio;
                while(aux!=null)
                {
                   if(DPI.equals(aux.DPI)){
                        aux.Nombre=Nombre;
                        aux.Apellido=Apellido;
                        aux.Genero=Genero;
                        aux.Telefono=Telefono;
                        aux.Direccion=Direccion;
                        break;
                   }
                    aux=aux.siguiente;
                }
            }
            
            
        }catch(Exception e2)
        {
           JOptionPane.showMessageDialog(null, "esta intentando agregar letras al DPI, ingrese solo numeros"); 
        }
    }
    
    public void Eliminar(String DPI){
        try
        {
        BigInteger  dpi= new BigInteger(DPI);
        int coordenada = dpi.mod(BigInteger.valueOf(size)).intValue();
            if(arregloHash[coordenada]!=null)
            {
                NodoLS aux=arregloHash[coordenada].ListaClientes.Inicio;
                
                while(aux!=null)
                {
                   if(aux.siguiente==null&&aux.DPI.equals(DPI)&&aux.anterior==null)
                   {
                        JOptionPane.showMessageDialog(null, "Se elimino el cliente: "+aux.Nombre); 
                       arregloHash[coordenada]=null;
                   }
                   else if(aux.DPI.equals(DPI)&&aux.anterior==null&&aux.siguiente!=null){
                       JOptionPane.showMessageDialog(null, "Se elimino el cliente: "+aux.Nombre); 
                       arregloHash[coordenada].ListaClientes.Inicio=aux.siguiente;
                       aux.anterior=null;
                   }
                   else if(aux.DPI.equals(DPI)&&aux.siguiente==null&&aux.anterior!=null)
                   {
                       JOptionPane.showMessageDialog(null, "Se elimino el cliente: "+aux.Nombre); 
                       aux.anterior.siguiente=null;
                       arregloHash[coordenada].ListaClientes.Fin=aux.anterior;
                       
                   }
                   else if(aux.DPI.equals(DPI))
                   {
                       JOptionPane.showMessageDialog(null, "Se elimino el cliente: "+aux.Nombre); 
                       aux.anterior.siguiente=aux.siguiente;
                       aux.siguiente.anterior=aux.anterior;
                   }
                    aux=aux.siguiente;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No existe ningun elemento con el DPI que intento gestionar"); 
            }
            
            
        }catch(Exception e2)
        {
           JOptionPane.showMessageDialog(null, "esta intentando agregar letras al DPI, ingrese solo numeros"); 
        }
    }
    
    

    public NodoHash[] getArregloHash() {
        return arregloHash;
    }
    
    public void imprimir(){
        for(int x=0;x<size;x++)
        {
            if(arregloHash[x]!=null)
            {
                NodoLS aux=arregloHash[x].ListaClientes.Inicio;
                System.out.println("Usuarios registrados en coordenada: "+x);
                while(aux!=null)
                {
                    System.out.println(aux.DPI+"; "+aux.Nombre+"; "+aux.Apellido+"; "+aux.Genero+"; "+aux.Telefono+"; "+aux.Direccion);
                    
                    aux=aux.siguiente;
                }
                System.out.print("\n");
            }
        }
        System.out.print(contadorHash);
          System.out.print("\n");  System.out.print("\n");  System.out.print("\n");
    }
    
    
    
    
}
