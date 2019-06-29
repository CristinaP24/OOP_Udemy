public class Dog extends Animal {

    //extends is used to inherit
    //need to call the constructor from super class from child class (it has to have a constructer too)
    //super is used to call the constructor from the class that we're extending from
    //super allows us to initialize de super class
    //when you add new mets in base class, you need to add it in constructor in child class, and you by
    //a. removing parameters from () of constructor, the ones that are from base class
    //b. adding values after super ()
    //c. adding parameters in child class in method signature () of constructor in child class - overload child constructor param
    //d. initialize the other parameters in child class inside constructor, with this.
    // to override a method in a superclass, remain in child class and - Code - Override Method - select met (notice super kw)
   //super method (extended one) is firstly executed authomatically if there is no other specific method

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {//initialize base ch. of super class
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
private void chew (){ //overrides the method eat in superclass
    System.out.println("dog.chew() called");
}

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();//identifies and calls met in super class of current class
    }

    public void walk(){
        System.out.println("dog.walk() called");
        move(5);
    }
    public void run (){
        System.out.println("dog.run() called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        super.move(speed);
        moveLegs(speed);//specific for Dog.move, that's why we don't add super kw to extend from Animal
        //even if we have a met. dogMove, in the Dog class we used super. move and Java goes authomatically to super class=Animal and executes method
   //parent rules
    }
}
