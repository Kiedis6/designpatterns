package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory;

import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.Keyboard;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.KeyboardMac;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.Mouse;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.model.MouseMac;

/**
 * @author : Alejandro Mateo
 * @since : 15/6/21, mar.
 **/
public class DeviceFactoryMac implements DeviceFactory {

    @Override
    public Keyboard createKeyboard() {
        return new KeyboardMac();
    }

    @Override
    public Mouse createMouse() {
        return new MouseMac();
    }
}
