package zub_denys;

public class Fighter {
    private String name;
    private int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner (Fighter fighter1, Fighter fighter2, String first_attack){
        while(fighter1.health > 0 && fighter2.health>0){
            fighter1.health -=fighter2.damagePerAttack;
            fighter2.health -=fighter1.damagePerAttack;
        }

        if(fighter1.health<=0 && fighter2.health<=0) {
            return first_attack;
        }
        else if(fighter1.health<=0){
                return fighter2.name;
            }
            else{
                return fighter1.name;
            }
        }


    public static void main(String[] args) {

        System.out.println(Fighter.declareWinner(new Fighter("Indigo",100,20),
                new Fighter("Antonio",100,20),"Antonio"));

        System.out.println(Fighter.declareWinner(new Fighter("Boyko",100,25),
                new Fighter("Anton",110,15),"Anton"));

        System.out.println(Fighter.declareWinner(new Fighter("Max",120,15),
                new Fighter("Ant",100,20),"Ant"));

    }
}
