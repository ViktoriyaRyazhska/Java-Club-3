package com.softserve.team1;

public class TwoFightersOneWinner {

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
}