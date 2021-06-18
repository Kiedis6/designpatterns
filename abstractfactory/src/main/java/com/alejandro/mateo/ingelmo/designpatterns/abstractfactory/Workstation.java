package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory;

import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory.DeviceFactory;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.Keyboard;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.Mouse;

/**
 * @author : Alejandro Mateo
 * @since : 15/6/21, mar.
 **/

//esto es una prueba
public class Workstation {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Workstation(DeviceFactory deviceFactory) {
        keyboard = deviceFactory.createKeyboard();
        mouse = deviceFactory.createMouse();
    }

    public void pressKey() {
        keyboard.pressKey();
    }

    public void moveCursor() {
        mouse.moveCursor();
    }
}
