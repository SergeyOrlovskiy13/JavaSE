package task_2;

public class main {

    public static void main(String[] args) {
        Car car = new Car( 2005);
        car.year = 2010;
        car.color = "red";
        System.out.println("car = " + car.getYear()+" " + car.getColor());
    }
}
