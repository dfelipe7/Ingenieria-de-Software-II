/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

/**
 *
 * @author Unicauca
 */
public class Square extends Figure {
    private int lado;
    
    
    public Square (int lado){
        this.lado=lado;
        
    }
    
    public int getLado(){
        return lado;
    }

    @Override
    public double calculateArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calculatePerimeter() {
        return lado*4;
    }
    
}
