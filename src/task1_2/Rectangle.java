package task1_2;

import java.util.Scanner;

public class Rectangle {
     double side1;
     double side2;
     public Rectangle() {
     }
     public Rectangle (double side1, double side2){
          this.side1 =side1;
          this.side2 =side2;
     }
     public  double areaCalculator(){
          double area;
          area = side1 *side2;
          return area;
     }
     public double perimeterCalculator(){
          double perimeter;
          perimeter = (side1 + side2)*2;
          return perimeter;
     }

     public static void main(String[] args) {
          Rectangle r1 = new Rectangle( 2.2, 4.4);
          double area = r1.areaCalculator();
          double perimeter = r1.perimeterCalculator();

          System.out.println("area = " + area);
          System.out.println("perimeter = " + perimeter);




     }



}





