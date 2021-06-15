package com.alejandro.mateo.ingelmo.designpatterns.abstractfactory;

import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory.DeviceFactory;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory.DeviceFactoryMac;
import com.alejandro.mateo.ingelmo.designpatterns.abstractfactory.factory.DeviceFactoryWin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);

		Workstation workstation = configureWorkstation();
		workstation.moveCursor();
		workstation.pressKey();
	}

	private static Workstation configureWorkstation() {
		Workstation workstation;
		DeviceFactory deviceFactory;

		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			deviceFactory = new DeviceFactoryMac();
		} else {
			deviceFactory = new DeviceFactoryWin();
		}
		workstation = new Workstation(deviceFactory);

		return workstation;
	}
}
