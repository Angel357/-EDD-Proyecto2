/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author wilson
 */
public class nodoArbolB {
    String[] keys;
    // Objetos tipo Vehiculo
    ObjVehiculo[] objV;
    int t;
    nodoArbolB[] C;
    int n;
    boolean hoja;
    
    nodoArbolB(int t, boolean hoja)
    {
        this.t = t;
        this.hoja = hoja;
        this.keys = new String[2*t - 1];
        this.objV = new ObjVehiculo[2*t - 1];
        this.C = new nodoArbolB[2*t];
        this.n = 0;
    }
    
    // Mostrar arbol traverse
    public void imprimir()
    {
        int i = 0;
        for (i = 0; i < this.n ; i++)
        {
            if(this.hoja == false)
            {
                C[i].imprimir();
            }
            System.out.print(keys[i] + " ");
        }
        
        if(hoja == false)
            C[i].imprimir();
    }
    
    // Buscar algun nodo, regresa nulo si no existe
    int i;
    nodoArbolB buscar(String k)
    {
        i = 0;
        while(i < n && k.compareToIgnoreCase(keys[i]) > 0)
            i++;
        
        if(keys[i].compareToIgnoreCase(k) == 0)
        {
            setCurrentKey(i);
            return this;
        }
            
        if(hoja==true)
            return null;
        
        return C[i].buscar(k);
    }
    
    // Para accesar la llave actual.
    public void setCurrentKey(int i)
    {
        this.i = i;
    }
    
    public void insertarNoLleno(String k)
    {
        int i = n - 1;
        
        // si es hoja
        if(hoja == true)
        {
            while(i >= 0 && keys[i].compareToIgnoreCase(k) > 0)
            {
                keys[i+1] = keys[i];
                i--;
            }
            keys[i+1] = k;
            n++;
        }
        else // si no es hoja
        {
            while(i >= 0 && keys[i].compareToIgnoreCase(k) > 0)
                i--;
            
            if(C[i+1].n == 2*t-1)
            {
                separarHijo(i+1,C[i+1]);
                
                
                if(keys[i+1].compareToIgnoreCase(k) < 0)
                    i++;
            }
            C[i+1].insertarNoLleno(k);
        }
        
    }

    public void separarHijo(int i, nodoArbolB y)
    {
        nodoArbolB z = new nodoArbolB(y.t,y.hoja);
        z.n = t - 1;
        
        for(int j = 0; j < t-1;j++)
            z.keys[j] = y.keys[j+t];
        
        if(y.hoja == false)
        {
            for(int j = 0; j < t; j++)
                z.C[j] = y.C[j+t];
        }
        y.n = t - 1;
        
        for(int j = n; j >= i+1;j--)
            C[j+1] = C[j];
        
        C[i+1] = z;
        
        for(int j = n -1; j >= i; j--)
            keys[j+1] = keys[j];
        
        
        keys[i] = y.keys[t-1];
        
        n = n + 1;
    }
    
    
    // Metodos de eliminar en arbol B
    
}
