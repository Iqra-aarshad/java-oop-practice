public class Fighter {
    private String name;
    private int health;
    private int attackPower;
    public Fighter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;

    }
    public void attack(Fighter opponent) {
        opponent.health -= attackPower;
        System.out.println(name + " attacks " + opponent.name + " for " + attackPower + " damage.");

    }
    public boolean isAlive() {
        return health > 0;

    }
    public static void main(String[]args) {
        Fighter fighter1 = new Fighter("Aliza",50,20);
        Fighter fighter2 = new Fighter("Aisha",50,15);
        while(fighter1.isAlive()&& fighter2.isAlive()) {
            fighter1.attack(fighter2);
            System.out.println(fighter2.name+" remaining HP is "+fighter2.health);
            if (fighter2.isAlive()) {
                break;

            }
            fighter2.attack(fighter1);
            System.out.println(fighter1.name +" remaining HP is"+ fighter1.health);


        }
        if (fighter1.isAlive()) {
            System.out.println(fighter1.name+ " wins");

        }
        else {
            System.out.println(fighter2.name + " wins");
        }
    }


    
}
