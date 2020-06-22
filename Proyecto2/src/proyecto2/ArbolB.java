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
public class ArbolB {
    
     public nodoArbolB root;
    public int t;
    
    ArbolB(int t)
    {
        this.root = null;
        this.t = t;
    }
      
    public void imprimir()
    {
        if(this.root != null)
            this.root.imprimir();
        System.out.println();
    }
   
    public nodoArbolB buscar(int k)
    {
        if(this.root == null)
            return null;
        else 
            return this.root.buscar(k);
    }
    
    
    public void insertar(int k)
    {
        if(root == null)
        {
            root = new nodoArbolB(t,true);
            root.keys[0] = k;
            root.n = 1;
        }
        else
        {
            if(root.n == 2*t-1)
            {
                nodoArbolB s = new nodoArbolB(t,false);
                s.C[0] = root;
                s.separarHijo(0, root);
                
                int i = 0;
                if(s.keys[0] < k)
                    i++;
                s.C[i].insertarNoLleno(k);
                
                root = s;
            }
            else  // si la raiz no esta llena solo insertarlo.
                root.insertarNoLleno(k);
        }
        
    }

}
