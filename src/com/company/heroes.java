package com.company;

public class heroes {
    private int health;
    private int damage;
    private String superPower;

    public heroes(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public heroes(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}