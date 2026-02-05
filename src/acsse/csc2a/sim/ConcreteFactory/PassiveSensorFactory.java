package acsse.csc2a.sim.ConcreteFactory;

import acsse.csc2a.sim.AbstractFactory.ISensorFactory;
import acsse.csc2a.sim.AbstractProduct.ICoastalSensor;
import acsse.csc2a.sim.AbstractProduct.IDesertSensor;
import acsse.csc2a.sim.AbstractProduct.IMountainSensor;
import acsse.csc2a.sim.ConcreteProduct.PassiveCoastalSensor;
import acsse.csc2a.sim.ConcreteProduct.PassiveDesertSensor;
import acsse.csc2a.sim.ConcreteProduct.PassiveMountainSensor;

public class PassiveSensorFactory implements ISensorFactory{

	@Override
	public ICoastalSensor createCoastalSensor() {
		return new PassiveCoastalSensor();
	}

	@Override
	public IDesertSensor createDesertSensor() {
		return new PassiveDesertSensor();
	}

	@Override
	public IMountainSensor createMountainSensor() {
		return new PassiveMountainSensor();
		}

	}


