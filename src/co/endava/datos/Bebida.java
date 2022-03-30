/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
//Se crea un hija que hereda de la clase de producto
public class Bebida extends Producto {
    //Construmimos el constructor y traemos las caracteristicas heredads del metodo heredado
    public Bebida(int id, String nombre, double precio){
        super(id, nombre, precio);
    }

    //sobrecargamos el metodo
    @Override
    public double getDescuento() {
        //se crea una variable con el valor de la hora local del sistema
        LocalTime now = LocalTime.now();
        //Se valida una franja horaria para otorgar el descuento, entre las 17 y 18 horas
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            //si se cumple la condicion se da el descuento
            return this.getPrecio() * 0.2d;
        } else {
            return 0;
        }
    }
}
