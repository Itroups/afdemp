/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13_11_1_1.newpackage;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Stage {
     Actor actor= new SadActor();
    public void swap(){
        actor = new HappyActor();
    }
    public void play(){
        actor.act();
    }
}
