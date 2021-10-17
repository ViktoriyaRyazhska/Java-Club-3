package zub_denys;

import java.util.Scanner;

public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void GetInfo() {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = info.nextLine();
        System.out.println("Enter health: ");
        health = info.nextInt();
        System.out.println("Enter damagePerAttack: ");
        damagePerAttack = info.nextInt();

    }



    public void declareWinner() {

        System.out.println("Enter first fighter (1/2):");
        Scanner myObj = new Scanner(System.in);
        int res = myObj.nextInt();
        Fighter fighter1 = new Fighter("20", 5, 2);
        fighter1.GetInfo();
        Fighter fighter2 = new Fighter("23", 578, 67);
        fighter2.GetInfo();
        String firstAttacker = fighter1.name;
        if (res == 2) {
            firstAttacker = fighter2.name;
        }
        boolean check = firstAttacker.equals(fighter1.name);
        while (true) {
            if (check) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    System.out.println(fighter1.name);
                    break;
                }
                //return fighter1.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    System.out.println(fighter2.name);
                    break;
                }

            }
            check = !check;
        }
    }
}
