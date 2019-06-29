public class Player {
    //Simple class- no encaps
    //Disadv 1.change name of fileds, 2.modify values or add variables that affect current code 3. forget to initialize variables when class is called
    public String name;
    public int health;
    public String weapon;

    public void loseHealth (int damage){
        this.health = this.health-damage;
        if(this.health<=0){
            System.out.println("Player knocked out.");
            //reduces no of lives
        }
    }
    public int healthRemaining (){
        return this.health;
    }

















}
