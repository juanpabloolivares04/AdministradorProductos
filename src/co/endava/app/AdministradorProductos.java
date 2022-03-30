/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
//Clase Principal del proyecto
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
//Metodo principal del proyecto
    public static void main(String[] args) {
        //Se dan los valores a los productos creados
        Producto p1 = new Producto(101, "Café", 1500);
        Producto p2 = new Producto(102, "Azucar", 2500);
        //se añade la caracteristica de dos dias despues para la ffecha de vencimiento
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));
        Producto p4 = new Bebida(104, "Té", 1800);
        //Imprime por consola los siguientes valores
        //Precio del producto 1
        System.out.println(p1.getPrecio());
        //Precio del producto 2
        System.out.println(p2.getPrecio());
        //imprime los caracteristicas del producto 3
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento());
        //imprime los caracteristicas del producto 4
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento());
        
        Producto p5 = new Producto(105, "Agua", 1800);
        if (p5 == null) {
            System.out.println("El objeto está nulo");
        } else {
            if (p5.getNombre() == null) {
                System.out.println("El nombre está nulo");
            } else {
                System.out.println(p5.getNombre());
            }
        }
        BigDecimal numero = BigDecimal.ZERO;
        try {
            numero = BigDecimal.valueOf(Long.parseLong("140"));
        } catch (Exception e){
            numero = BigDecimal.ONE;
            System.out.println("No se pudo convertir " + e);
        }
        System.out.println(numero);
    }
    
}
