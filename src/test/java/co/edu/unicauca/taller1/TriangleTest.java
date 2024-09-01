/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

import org.junit.After;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Unicauca
 */
public class TriangleTest {
    @Test
    void testCreate(){
        Triangle triangulo = new Triangle(5,4,2);
        assertEquals(5,triangulo.getBase());
        assertEquals(4,triangulo.getAltura());
        assertEquals(2,triangulo.getLado());
    }
   //Test para probar el calculo del area
    @Test
    void testCalculate(){
        Triangle triangulo=new Triangle(5,4);
        assertEquals(10,triangulo.calculateArea());
        
    }
    
    //Test para probar el calculo del perimetro

    @Test
    void testCalculatePerimetro(){
         Triangle triangulo=new Triangle(2);
         assertEquals(6,triangulo.calculatePerimeter());
        
    }
    
}
