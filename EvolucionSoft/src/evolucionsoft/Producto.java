/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolucionsoft;

import java.util.List;

/**
 *
 * @author ALEX
 */
public class Producto {
    
    private String Nombre;
    private double Precio1;
    private double Descuento;
    private double IGV;
    private double PrecioFinal;
    private boolean Disponible;
    private int Stock;
    public Producto()
    {
        Nombre="Carro";Precio1=20000;Descuento=0.15;IGV=0.18;Disponible=true;Stock=3;
    }
    public double HallarPrecioFinal() {
        return PrecioFinal = (Precio1*(1-Descuento))*(1+IGV);
    }

    public String MiNombre() {
        return Nombre;
    }

    public boolean Comprar(double monto) {
        if (Disponible==true && monto>PrecioFinal){
            Stock--;
            if(Stock>0) Disponible=false;
            else Disponible=true;
            return true;
        }        
        else return false;
    }

    public Producto retornar(Producto producto) {
        return producto;
    }

    public List<Producto> retornarLista(List<Producto> LstProducto) {
        return LstProducto;
    }

    public void Exception1Division() {
        try {
            int a = 0, b = 0, c;
            c = a / b;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    public void Exception2Conversion() {
        Object o=null;
        try {
            int i=(int)o;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
