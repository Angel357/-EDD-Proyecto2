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
    int[] keys;
    int t;
    nodoArbolB[] C;
    int n;
    boolean hoja;
    
    nodoArbolB(int t, boolean hoja)
    {
        this.t = t;
        this.hoja = hoja;
        this.keys = new int[2*t - 1];
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
    nodoArbolB buscar(int k)
    {
        int i = 0;
        while(i < n && k > keys[i])
            i++;
        
        if(keys[i]  == k)
            return this;
        
        if(hoja==true)
            return null;
        
        return C[i].buscar(k);
    }
    
    public void insertarNoLleno(int k)
    {
        int i = n - 1;
        
        // si es hoja
        if(hoja == true)
        {
            while(i >= 0 && keys[i] > k)
            {
                keys[i+1] = keys[i];
                i--;
            }
            keys[i+1] = k;
            n++;
        }
        else // si no es hoja
        {
            while(i >= 0 && keys[i] > k)
                i--;
            
            if(C[i+1].n == 2*t-1)
            {
                separarHijo(i+1,C[i+1]);
                
                
                if(keys[i+1] < k)
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
}
