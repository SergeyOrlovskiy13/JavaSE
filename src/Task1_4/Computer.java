package Task1_4;

public class Computer {
     static Computer [] computers = new Computer[5];
     String name;

    public Computer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        computers [0] = new Computer("Lenovo");
        computers [1] = new Computer("Asus");
        computers [2] = new Computer("HP");
        computers [3] = new Computer("Mac");
        computers [4] = new Computer("Dell");

        for (int i = 0; i < computers.length ; i++) {
            System.out.println(computers[i].name);
        }
    }


   }






