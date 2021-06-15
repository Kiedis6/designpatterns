package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model;

/**
 * @author : Alejandro Mateo
 * @since : 11/6/21, vie.
 **/
public class MouseMac implements Mouse{

    @Override
    public void moveCursor() {
        System.out.println("Move cursor Mac");
    }
}
