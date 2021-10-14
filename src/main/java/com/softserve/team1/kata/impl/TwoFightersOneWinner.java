package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;
import com.softserve.team1.models.Fighter;

public class TwoFightersOneWinner extends BaseKata {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (firstAttacker.equals(fighter2.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) return fighter2.name;
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) return fighter1.name;
            }
        } else {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) return fighter1.name;
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) return fighter2.name;
            }
        }
        return "";
    }

    @Override
    public void test() {
        //F1
        System.out.println("Enter fighter one name: ");
        String fighter1name = (String)readInput(InputType.STRING);
        System.out.println("Enter fighter one health: ");
        int fighter1health = (int)readInput(InputType.INT);
        System.out.println("Enter fighter one damage: ");
        int fighter1damage = (int)readInput(InputType.INT);
        //F2
        System.out.println("Enter fighter two name: ");
        String fighter2name = (String)readInput(InputType.STRING);
        System.out.println("Enter fighter two health: ");
        int fighter2health = (int)readInput(InputType.INT);
        System.out.println("Enter fighter two damage: ");
        int fighter2damage = (int)readInput(InputType.INT);

        //FIGHTERS
        Fighter fighter1 = new Fighter(fighter1name,fighter1health,fighter1damage);
        System.out.println("Fighter one created with parameters: " + fighter1.toString());
        Fighter fighter2 = new Fighter(fighter2name,fighter2health,fighter2damage);
        System.out.println("Fighter one created with parameters: " + fighter1.toString());
        System.out.println("Lets fight begin!!!");

        //WINNER
        TwoFightersOneWinner twoFightersOneWinner = new TwoFightersOneWinner();
        System.out.println("And winner of the fight is " + declareWinner(fighter1,fighter2,"fighter1"));
    }
}
