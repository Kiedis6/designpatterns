package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model;

/**
 * @author : Alejandro Mateo
 * @since : 11/6/21, vie.
 **/
public class KeyboardMac implements Keyboard{

    @Override
    public void pressKey() {
        System.out.println("press key Mac");
    }
}
