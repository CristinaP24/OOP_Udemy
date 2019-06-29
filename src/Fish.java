public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    //daca decid sa elimin parametrii din clasa parinte, ii scot din semnatura constructorului si dau direct o valoare dupa (super)

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles() {
    }

    private void moveBackFin() {
    }

























}
