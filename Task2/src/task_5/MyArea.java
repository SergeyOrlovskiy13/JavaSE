package task_5;

import java.util.Scanner;

public class MyArea {
    public final double Pi= 3.14;
    double s;

    public MyArea(double s) {
        this.s = s;
    }

    public MyArea() {
    }

   public void areaOfCircle(double pi) {
        System.out.println("Enter radius" );
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        this.s= Pi * r*r;
        System.out.println("s = " + s);;
    }
}
