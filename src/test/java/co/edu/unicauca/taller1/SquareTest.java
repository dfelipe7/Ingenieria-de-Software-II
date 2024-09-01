/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Unicauca
 */
public class SquareTest {
    Square cuadrado;
    @Test
    void testCreate(){
        
        //Square cuadrado=new Square(2);
           assertEquals(2, cuadrado.getLado());
        
    }
    //Test para probar el calculo del perimetro
    @Test
    void testCalculate(){
        //Square cuadrado = new Square(2);
        assertEquals(8, cuadrado.calculatePerimeter());
    }
     //Test para probar el calculo del perimetro

    @Test
    void testCalculateArea(){
        assertEquals(4,cuadrado.calculateArea());
    }
    
    /*
    Metodo para enviar los parametros de prueba a cada metodo cada vez que
    se ejecute la prueba, y no inicializar el constructor por cada metodo individual
    
    */
    @BeforeEach
    void inicializarParametros(){
        cuadrado= new Square(2);
        
    }
    
}
