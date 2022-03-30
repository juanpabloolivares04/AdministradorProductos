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
Double operacion1= 2000*0.1; //Descuento del 10%
        Double operacion2= 2000*0.05; //Descuento del 5% incorrecto
descuento1 = Double.toString(operacion1);
descuento2 = Double.toString(operacion2); 

        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
descuento2= Double.toString(p3.getDescuento());
        assertEquals(descuento1, descuento2);
        //assertEquals(descuento1, descuento3); caso fallido
    }
}