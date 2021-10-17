package zub_denys;

import java.util.Scanner;

public class Fighter {
    private String name;
    private int health, damagePerAttack;

    public Fighter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of fighter: ");
        this.name = sc.next();
        System.out.println("Enter health of fighter: ");
        this.health = sc.nextInt();
        System.out.println("Enter damage per attack of fighter: ");
        this.damagePerAttack = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damagePerAttack=" + damagePerAttack +
                '}';
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who will be first attacker: ");
        String first_attack = sc.next();
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter1.health -= fighter2.damagePerAttack;
            fighter2.health -= fighter1.damagePerAttack;
        }

        if (fighter1.health <= 0 && fighter2.health <= 0) {
            return first_attack;
        } else if (fighter1.health <= 0) {
            System.out.println("Winner of fight: ");
            return fighter2.name;
        } else {
            System.out.println("Winner of fight: ");
            return fighter1.name;
        }
    }


    public static void main(String[] args) {
//        Fighter fighter = new Fighter();
//        System.out.println(fighter);

        System.out.println(Fighter.declareWinner(new Fighter(),
                new Fighter()));
//
//        System.out.println(Fighter.declareWinner(new Fighter("Boyko",100,25),
//                new Fighter("Anton",110,15),"Anton"));
//
//        System.out.println(Fighter.declareWinner(new Fighter("Max",120,15),
//                new Fighter("Ant",100,20),"Ant"));

    }
}
