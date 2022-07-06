/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author cahuc
 */
public class Barbarian extends Character {

    private int rageLimit;
    private int damageReduction;
    private boolean fatigue;

    public Barbarian(String name) {
        super(name);
    }

    public Barbarian(String name, int level, int rageLimit) {
        super(name, level);
        this.rageLimit = rageLimit;
        this.damageReduction = 1;
        this.fatigue = false;
    }

    @Override
    public void attack() {
        System.out.println("ROAAAAAR! ATTACK!");
    }

    @Override
    public void receiveDamage(int dmg) {
        hitPoints = hitPoints - (dmg - damageReduction);
        System.out.println("Hit points: " + hitPoints);
    }

    // Getters and setters
    public int getRageLimit() {
        return rageLimit;
    }

    public void setRageLimit(int rageLimit) {
        this.rageLimit = rageLimit;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

}
