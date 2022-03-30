/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */

//Clase hija de Producto (heredada)
public class Comida extends Producto {
    //se instancie variable de tipo fecha
    private LocalDate fechaVencimiento;

//se crea un costructor con caracteristicas heredadas del producto
    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        //Se inicializa la variable de fecha de vencimiento y las variables de la clase heredada
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
    //se realiza el get del constructor propio del metodo
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    //se realiza el set del constructor propio del metodo
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //sobrecargamos el metodo  de descuento del metodo anterior
    @Override
    public double getDescuento() {
        //validamos que la fecha de vencimieno sea igual a la hora del sistema para otorgarle el descuento
        if (fechaVencimiento.equals(LocalDate.now())) {
            return super.getDescuento();
        } 
        else {
            //cuando no se cumple la condicion, devuelve un 0 de descuento
            return 0;
        }
    }
    //Sobrecargamos el metodo
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}
