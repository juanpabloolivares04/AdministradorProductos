/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
//CLase padre que se crea para instanciar las variables
public class Producto {
    //Variable privada de tipo entera
    private int id;
    //Variable privada de tipo string
    private String nombre;
    //Variable privada de tipo decimal de dos deciamels
    private double precio;

    //Se crea un metodo publico producto, que sobra y parece de por error
    public Producto() {
    }
    //se crea un constructor y se inicializa el constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Se realiza el getter de el objeto id
    public int getId() {
        return id;
    }
//Se realiza el setter de el objeto id
    public void setId(int id) {
        this.id = id;
    }

    //Se realiza el getter de el objeto nombre
    public String getNombre() {
        return nombre;
    }
    //Se realiza el setter de el objeto nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Se realiza el getter de el objeto nombre
    public double getPrecio() {
        return precio;
    }
    //Se realiza el setter de el objeto nombre
    public void setPrecio(double precio) {
        //Se realiza una condicion del valor que puede tener el precio
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio;
        }
    }
    //Se realiza un metodo de descuento, que es el que tiene el precio, pero no lo guarda en una variable
    public double getDescuento(){
        return precio * 0.1d;


    }

//Sobrecarga el metodo
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}
