/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author luisa
 */
public class ListaTop {
    NodoTop Inicio;
    public String reporte;
    
    
    public void InsertarTopViajes(String Nombre, int numero){
        NodoTop nuevo= new NodoTop(Nombre, numero);
         NodoTop aux;
        if(Inicio==null){
            Inicio=nuevo;
        }
        else if(Inicio.numero<nuevo.numero){
            nuevo.siguiente=Inicio;
            nuevo.siguiente.anterior=nuevo;
            Inicio=nuevo;
        }
        else{
            aux=Inicio;
            while(aux.siguiente!=null&&aux.siguiente.numero>nuevo.numero){
            aux=aux.siguiente;
            }
            nuevo.siguiente=aux.siguiente;
            if(aux.siguiente!=null){
                nuevo.siguiente.anterior=nuevo;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        } 
        
        
        
    }
    
    public void Imprimir(String tipo){
        reporte="";
        NodoTop aux=Inicio;
        while(aux!=null){
            System.out.println(aux.Nomnbre+"   "+aux.numero);
            aux=aux.siguiente;
        }
        aux=Inicio;
        switch(tipo){
            case "Top 10 viajes largos":
                int x=0;
                reporte+="          Reporte del Top de 10 viajes mas largos por numero de destinos \n\n\n";
                while(aux!=null&&x<=9){
                    x++;
                    reporte+=x+". Llave: "+aux.Nomnbre+" #destinos en viaje: "+aux.numero+"\n\n";
                    aux=aux.siguiente;
                }
                break;
            case "Top 10 clientes con viajes":
                int x1=0;
                reporte+="          Reporte del Top de 10 clientes con mayor numero de viajes \n\n\n";
                while(aux!=null&&x1<=9){
                    x1++;
                    reporte+=x1+". Nombre: "+aux.Nomnbre+" # de viajes registrados: "+aux.numero+"\n\n";
                    aux=aux.siguiente;
                }
                
                break;
            case "Top 10 conductores con viajes":
                int x2=0;
                reporte+="          Reporte del Top de 10 conductores que registran mas ganancias \n\n\n";
                while(aux!=null&&x2<=9){
                    x2++;
                    reporte+=x2+". Nombre: "+aux.Nomnbre+" # de viajes: "+aux.numero+" \n\n";
                    aux=aux.siguiente;
                }
                
                break;
            case "Top 10 vehiculos con viajes":
                int x3=0;
                reporte+="          Reporte del Top de 10 vehiculos con mas viajes regiatrados \n\n\n";
                while(aux!=null&&x3<=9){
                    x3++;
                    reporte+=x3+". PLaca: "+aux.Nomnbre+" #de viajes resgitrados: "+aux.numero+"\n\n";
                    aux=aux.siguiente;
                }
                break;
            default:
                break;
        }
    }
    
}
