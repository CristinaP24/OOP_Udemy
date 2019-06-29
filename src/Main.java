//class Movie {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public Movie(String name) {
//        this.name = name;
//    }
//    public String plot (){
//       return "No plot here - default";
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws(){
//        super("Jaws");
//    }
//    public String plot (){
//        return "Shark eats people.";
//    }
//}
//class IndependenceDay extends Movie {
//    public IndependenceDay(){
//        super("Independence Day");
//    }
//    public String plot(){
//        return "Aliens to tak eover Earth";
//    }
//}
//class MazeRunner extends Movie {
//    public MazeRunner(){
//        super("Maze Runner");
//    }
//    public String plot (){
//        return "Kids escape a maze.";
//    }
//}
//class StarWars extends Movie {
//    public StarWars (){
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial Forces take over.";
//    }
//}
//class Forgettable extends Movie {
//    public Forgettable (){
//        super("Forgettable");
//    }
//    //no plot met here
//}

public class Main {
    //even if you don't extend, a class is automatically extending from Java supply class ObjectClass
    //Generate - Override - hasCode, equals etc
    //generally, you look at composition first vs inheritnce

    public static void main(String args[]) {
//        for (int i = 1; i < 11; i++) {
//            Movie movie = randomMovie();//looks at object called Movie, does it have a met plot? If so, Java will execute
//            //in polymorhism, if you inehrit from another class and it has no met it executes met from parent class (ex. Forgettable class has no plot met
//            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie randomMovie() {//return a movie from the first 5 that extended class Movie
//        //need to generate a random no so each time this met is called, so each time a movie is selcted
//        //all classes inherit from Movie
//
//        int randomNo = (int) (Math.random() * 5) + 1;
//        System.out.println("Random no generate is " + randomNo);
//        switch (randomNo) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new Forgettable();
//        }
//
//        return null;//
//    }
//}

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long and silky coat");
        dog.eat();
        // dog.walk();
        dog.run();

        Peugeot peugeot = new Peugeot(36);
        peugeot.steer(45);
        peugeot.accelerate(30);
        peugeot.accelerate(20);
        peugeot.accelerate(-42);

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Deli", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2550, 1440));//create  class with new, without using a variable
        Motherboard theMotherboard = new Motherboard("BJ200", "Asus", 4, 6, "V2-44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

     Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(5,55);
        Lamp lamp = new Lamp("classic", false, 75);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Bedroom bedroom = new Bedroom("Cris", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        lamp.turnOn();

//        Player player = new Player();
//        player.name = "Cris";
//        player.health = 20;
//        player.weapon = "Knife";
//
//        int damage =10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is "+player.healthRemaining());
//
//        damage =11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is "+player.healthRemaining());

EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Cris",50,"knife" );
        System.out.println("Initial health is "+enhancedPlayer.getHitPoints());//must use getter to access as it is private

  Printer printer = new Printer(50, true);
        System.out.println("Initial page count "+printer.getPagPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+ " new total print count for printer "+printer.getPagPrinted());

}
}
