/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

/**
 *
 * @author Unicauca
 */
public class Triangle extends Figure {
    private double base;
    private double altura;
    private double lado;
    
    
    public Triangle(int base, int altura){
        this.base=base;
        this.altura=altura;
         }
    public Triangle(double base, double altura, double lado){
        this.base=base;
        this.altura=altura;
        this.lado=lado;
         }
     public Triangle(int lado){
        this.lado=lado;
         }
        public double getBase(){
            
            return base;
        }
        
        public void setBase(double base){
            this.base=base;
        }
        public double getAltura(){
            
            return altura;
        }
        public void setAltura(double altura){
            this.altura=altura;
        }
        
        
        public double getLado(){
            return lado;
        }
        public void setLado(double lado){
            this.lado=lado;
        }

    @Override
    public double calculateArea() {
        return   (base*altura)/2;
        
    }

    @Override
    public double calculatePerimeter() {
        return lado*3;
    }
        
    
    
    
}
