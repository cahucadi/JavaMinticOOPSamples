/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wild;

/**
 *
 * @author cahuc
 */
public class Mammal extends Animal {

    private int nTeeth;
    private boolean fur;
    private int nLegs;

    public Mammal() {
        System.out.println("MAMMAL GENERATED ON Mammal() Constructor");
    }

    public Mammal(int nTeeth, boolean fur, int nLegs) {
        this();
        this.nTeeth = nTeeth;
        this.fur = fur;
        this.nLegs = nLegs;
    }

    public int getnTeeth() {
        return nTeeth;
    }

    public void setnTeeth(int nTeeth) {
        this.nTeeth = nTeeth;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public int getnLegs() {
        return nLegs;
    }

    public void setnLegs(int nLegs) {
        this.nLegs = nLegs;
    }

    @Override
    public void feedTheirOffspring(){
        System.out.println("Got milk?");
    }
    
}
