package co.edu.unicauca.taller1;

import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        
        //Creacion de objetos para cada figura
        Figure fig1 = new Circle(1.0); //radio
        Figure fig2 = new Circle(2.3); //lado
        Figure fig3 = new Circle(4.2); //base y altura
        Figure fig4 = new Triangle(5,4,2);
        //Figure fig5 = new Triangle(2);
        Figure fig6 = new Square(2);
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        //figures.add(fig5);
        figures.add(fig6);
        int i=0;
        for (Figure fig : figures) {
            System.out.println("Figura "+(i+1)+":");
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
            i++;
        }

    }
}