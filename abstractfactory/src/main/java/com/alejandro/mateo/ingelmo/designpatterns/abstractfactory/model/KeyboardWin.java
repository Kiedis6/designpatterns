package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model;

/**
 * @author : Alejandro Mateo
 * @since : 11/6/21, vie.
 **/
public class KeyboardWin implements Keyboard{

    @Override
    public void pressKey() {
        System.out.println("press key Win");
    }
}
