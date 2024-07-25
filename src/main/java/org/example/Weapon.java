package org.example;

public enum Weapon {
    SWORD;
    private int damage;
    private double attackSpeed;

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
}
