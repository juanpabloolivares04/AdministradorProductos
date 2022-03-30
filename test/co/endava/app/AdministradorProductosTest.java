package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    void main() {
String descuento1, descuento2, descuento3;
descuento1 = "200.0"; //Descuento del 10%
descuento3 = "100.o"; //Descuento del 5% incorrecto

        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
descuento2= Double.toString(p3.getDescuento());
        assertEquals(descuento1, descuento2);
        //assertEquals(descuento1, descuento3); caso fallido
    }
}