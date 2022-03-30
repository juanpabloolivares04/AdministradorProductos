package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    void main() { //descuento correcto
        String descuento1,descuento2;
        Double operacion1 = 2000 * 0.1; //Descuento del 10%

        descuento1 = Double.toString(operacion1);


        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        descuento2 = Double.toString(p3.getDescuento());
        assertEquals(descuento1, descuento2);

    }

    @Test
    void error() { //caso fallido descuento incorrecto
        String  descuento3, descuento4;
        Double operacion3 = 1000 * 0.05; //Descuento del 5% incorrecto
        descuento3 = Double.toString(operacion3);
        Comida p3 = new Comida(103, "Carne", 1000, LocalDate.now());
        descuento4 = Double.toString(p3.getDescuento());
        assertEquals(descuento3, descuento4);

    }

    @Test
    void normal() { //sin descuento
        String  descuento5;
        Comida p3 = new Comida(103, "Dulce", 500, LocalDate.now().plusDays(1));
        descuento5 = Double.toString(p3.getDescuento());
        assertEquals("0.0", descuento5);

    }


}