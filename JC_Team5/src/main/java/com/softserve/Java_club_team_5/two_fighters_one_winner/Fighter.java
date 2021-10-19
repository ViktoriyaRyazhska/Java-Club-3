package com.softserve.Java_club_team_5.two_fighters_one_winner;

public class Fighter {

    private final String name;
    private final int health;
    private final double attackDamage;

    Fighter(final String name, final int health, final double attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public int getHealth() {
        return health;
    }
}
