/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic;

import models.Beta;
import wild.Bird;
import wild.Cat;
import wild.Dog;

/**
 *
 * @author cahuc
 */
public class TestClass {
    
    public static void main(String[] args) {
       
          Cat c = new Cat( 20, false, 4);
          c.showCatInfo("Misifú");
          c.feedTheirOffspring();
          
          Bird b = new Bird();
          b.feedTheirOffspring();
          
          Dog d = new Dog();
          d.feedTheirOffspring();
    }
    
}
