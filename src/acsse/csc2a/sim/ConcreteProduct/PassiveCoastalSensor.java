package acsse.csc2a.sim.ConcreteProduct;

import acsse.csc2a.sim.AbstractProduct.ICoastalSensor;

public class PassiveCoastalSensor implements ICoastalSensor {
    @Override
    public void deploy() {
        System.out.println("PASSIVE COASTAL Sensor is monitoring ambient conditions.");
    }
}