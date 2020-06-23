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
public class ObjVehiculo {
    String placa;
    String marca;
    String modelo;
    String year;
    String color;
    String precio;
    String transmision;
    
    ObjVehiculo(String placa, String marca, String modelo, String year, String color, String precio, String transmision)
    {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.precio = precio;
        this.transmision = transmision;
    }
    
    public String getPlaca() { return this.placa; }
    public String getMarca() { return this.marca; }
    public String getModelo(){ return this.modelo;}
    public String getYear()  { return this.year;  }
    public String getColor() { return this.color; }
    public String getPrecio(){ return this.precio;}
    public String getTrans() { return this.transmision;}
    
}
