package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory;

import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.Keyboard;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.Mouse;

/**
 * @author : Alejandro Mateo
 * @since : 11/6/21, vie.
 **/
public interface WorkstationFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
}
