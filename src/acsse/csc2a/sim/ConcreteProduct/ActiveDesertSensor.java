package acsse.csc2a.sim.ConcreteProduct;

import acsse.csc2a.sim.AbstractProduct.IDesertSensor;

public class ActiveDesertSensor implements IDesertSensor {
    @Override
    public void deploy() {
        System.out.println("ACTIVE DESERT Sensor is probing sand composition.");
    }
}