package com.Momo;

/**I will do this later
 * Created by Sheveil Johnson on 2/18/2016.
 */
public class DinosaurSuperVisor {
    public static void main(String[] args) {
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur myDinosaur = new Dinosaur();
        t_rex.roar();
        velociraptor.roar();
        velociraptor.eat();
        t_rex.eat();
        myDinosaur.eat();
    }
}
