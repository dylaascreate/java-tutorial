package A5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;

interface Triangle {
    void calculateTriangle();
}

interface Square {
    void calculateSquare();
}

interface Rectangle {
    void calculateRectangle();
}

class Shape implements Triangle, Square, Rectangle {

    //Triangle
    double base, height, areaTriangle;
    // Square
    double side, areaSquare;
    // Rectangle
    double length, width, areaRectangle;
    
    int shapeType;

    public void calculateTriangle() {
        System.out.println("Calculating Triangle...");
        
        areaTriangle = 0.5 * base * height;
        // display output in Joptionpane
        JOptionPane.showMessageDialog(null,
        "Area of the Triangle: " + areaTriangle);
    }

    public void calculateSquare() {
        System.out.println("Calculating Square...");
        
        areaSquare = side * side;
        // display output in Joptionpane
        JOptionPane.showMessageDialog(null,
        "Area of the Square: " + areaSquare);
    }

    public void calculateRectangle() {
        System.out.println("Calculating Rectangle...");

        areaRectangle = length * width;
        // display output in Joptionpane
        JOptionPane.showMessageDialog(null, 
        "Area of the Rectangle: " + areaRectangle);
    }
}

public class hierachicalinheritence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // write into txt file "shapecalc.txt"
        try (PrintWriter out=new PrintWriter((new FileWriter("shapecalc.txt"))))
        {
        Shape s = new Shape();

        System.out.println("Enter the shape type \n(1. Triangle / 2. Square / 3. Rectangle):");
        s.shapeType = sc.nextInt();

        if (s.shapeType==1) {
            String shapeName= "Triangle";
            System.out.println("Enter base and height for Triangle:");
            System.out.print("Base:");
            s.base = sc.nextDouble();
            System.out.print("Height:");
            s.height = sc.nextDouble();
            s.calculateTriangle();
            
            out.println("Area of " + shapeName + " is " + s.areaTriangle);
        } 
        else if (s.shapeType==2) {
            String shapeName= "Square";
            System.out.println("Enter side for Square:");
            System.out.print("Side:");
            s.side = sc.nextDouble();
            s.calculateSquare();
            
            out.println("Area of " + shapeName + " is " + s.areaSquare);
        } 
        else if (s.shapeType==3) {
            String shapeName= "Rectangle";
            System.out.println("Enter length and width for Rectangle:");
            System.out.print("Length:");
            s.length = sc.nextDouble();
            System.out.print("Width:");
            s.width = sc.nextDouble();
            s.calculateRectangle();
            
            out.println("Area of " + shapeName + " is " + s.areaRectangle);
        } else {
            System.out.println("Invalid shape type!");
        }
        System.out.println("\nSuccessfully restore data in file.\n");
        out.close();
    }
    catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    } 
    }
}