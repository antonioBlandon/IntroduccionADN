package co.com.ceiba.pruebabasicaappalumno;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Alumno alumno = new Alumno("001","pepe",18.00,16.00);
        double promedio = alumno.calcularPromedio();
        assertEquals(17.00, promedio,0.00);
    }
}