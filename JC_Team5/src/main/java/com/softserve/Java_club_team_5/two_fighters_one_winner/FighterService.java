package com.softserve.Java_club_team_5.two_fighters_one_winner;

public class FighterService {

    private final Fighter fighterBob = new Fighter("Bob", 50, 3);
    private final Fighter fighterTod = new Fighter("Tod", 30, 7);

    public void fight() {
        double todHealth = fighterTod.getHealth();
        double bobHealth = fighterBob.getHealth();

        while (todHealth >= 0 && bobHealth >= 0) {
            System.out.println(fighterTod.getName() + ": " + todHealth + " - "
                    + fighterBob.getName() + " attacks " + fighterBob.getAttackDamage());
            todHealth = todHealth - fighterBob.getAttackDamage();

            System.out.println(fighterBob.getName() + ": " + bobHealth + " - "
                    + fighterTod.getName() + " attacks " + fighterTod.getAttackDamage() + "\n");
            bobHealth = bobHealth - fighterTod.getAttackDamage();

            if (todHealth <= 0) {
                System.out.println("Bod win!");

            } else if (bobHealth <= 0) {
                System.out.println("Tob win!");
            }
        }
    }

}
