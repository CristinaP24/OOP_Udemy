public class EnhancedPlayer {
    //to change name of fields - clik on it, refactor - rename
    //refactoring fields will not change the name of met that contain them
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {//call the constructor
        this.name = name;
        if (health > 0 && health <= 100) {//te asigur ca
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out.");
            //reduces no of lives
        }


    }
}
