/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wild;

/**
 *
 * @author cahuc
 */
public class Cat extends Mammal {

    private int purrLevel;

    public Cat() {
    }

    public Cat(int nTeeth, boolean fur, int nLegs) {
        super(nTeeth, fur, nLegs);
    }

    public int getPurrLevel() {
        return purrLevel;
    }

    public void setPurrLevel(int purrLevel) {
        this.purrLevel = purrLevel;
    }

    public void showCatInfo() {
        showCatInfo("This cat");
    }

    public void showCatInfo(String name) {
        System.out.println(name +" has: " + getnTeeth() + " teeth");
    }


}
