package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory;

import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.*;

/**
 * @author : Alejandro Mateo
 * @since : 15/6/21, mar.
 **/
public class DeviceFactoryWin implements DeviceFactory {

    @Override
    public Keyboard createKeyboard() {
        return new KeyboardWin();
    }

    @Override
    public Mouse createMouse() {
        return new MouseWin();
    }
}
