package acsse.csc2a.sim.ConcreteProduct;

import acsse.csc2a.sim.AbstractProduct.IDesertSensor;

public class PassiveDesertSensor implements IDesertSensor {
    @Override
    public void deploy() {
        System.out.println("PASSIVE DESERT Sensor is monitoring ambient conditions.");
    }
}