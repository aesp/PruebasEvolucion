/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolucionsoft;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALEX
 */
public class ProductoTest {
    
    List<Producto>lstProducto=new ArrayList<Producto>();
    Producto prod=new Producto();
    

    @Test
    public void TestNumericoIguales() {
        System.out.println("TestNumericoIguales");
        double expResult = 18.5;
        double result = prod.HallarPrecioFinal();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TestNumericoDiferentes() {
        System.out.println("TestNumericoDiferentes");
        double expResult = 13.22;
        double result = prod.HallarPrecioFinal();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TestTextoIguales() {
        System.out.println("TestTextoIguales");
        String expResult = "Carro";
        String result = prod.MiNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void TestTextoDiferentes() {
        System.out.println("TestTextoDiferentes");
        String expResult = "Auto";
        String result = prod.MiNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void TestBooleanIguales() {
        System.out.println("TestBooleanIguales");
        boolean expResult = true;
        boolean result = prod.Comprar(25000);
        assertEquals(expResult, result);
    }

    @Test
    public void TestBooleanDiferentes() {
        System.out.println("TestBooleanDiferentes");
        boolean expResult = false;
        boolean result = prod.Comprar(10000);
        assertEquals(expResult, result);
    }

    @Test
    public void TestObjetoIguales() {
        System.out.println("TestObjetoIguales");
        Object expResult = prod;
        Object result = prod.retornar(prod);
        assertEquals(expResult, result);
    }

    @Test
    public void TestObjetoDiferentes() {
        System.out.println("TestObjetoDiferentes");
        Object expResult = null;
        Object result = prod.retornar(prod);
        assertEquals(expResult, result);
    }

    @Test
    public void TestListasIguales() {

        Producto pl1 = new Producto();
        Producto pl2 = new Producto();
        lstProducto.add(pl1);
        lstProducto.add(pl2);
        System.out.println("TestListasIguales");
        Object expResult = lstProducto;
        Object result = prod.retornarLista(lstProducto);
        assertEquals(expResult, result);
    }

    @Test
    public void TestListasDiferentes() {

        Producto pl1 = new Producto();
        Producto pl2 = new Producto();
        lstProducto.add(pl1);
        lstProducto.add(pl2);
        System.out.println("TestListasDiferentes");
        Object expResult = null;
        Object result = prod.retornarLista(lstProducto);
        assertEquals(expResult, result);
    }
    @Test
    public void TestException1Division()
    {
        prod.Exception1Division();
    }
    @Test
    public void TestException2Conversion()
    {
        prod.Exception2Conversion();
    }
}
