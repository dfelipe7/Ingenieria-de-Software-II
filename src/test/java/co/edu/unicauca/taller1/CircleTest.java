package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCreate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius());
    }
    //Test para probar el calculo del perimetro

    @Test
    void testCalculate(){
        Circle circle = new Circle(2.0);
        assertEquals(2.0*Math.PI*2.0, circle.calculatePerimeter());
    }
     //Test para probar el calculo del area

    @Test
    void testCalculateArea(){
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI*Math.pow(2.0, 2),circle.calculateArea());
    }
    
    

}