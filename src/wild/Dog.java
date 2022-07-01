/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wild;

/**
 *
 * @author cahuc
 */
public class Dog extends Mammal {

    private boolean isAlpha;
    
    public Dog(){
        super(0,false,0);
    }

    public boolean getIsAlpha() {
        return isAlpha;
    }

    public void setIsAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    public void showDogInfo() {
        System.out.println("This dog has: " + getnLegs()  + " legs");
    }
}
