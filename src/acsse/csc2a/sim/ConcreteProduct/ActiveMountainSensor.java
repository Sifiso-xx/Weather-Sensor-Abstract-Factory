package acsse.csc2a.sim.ConcreteProduct;

import acsse.csc2a.sim.AbstractProduct.IMountainSensor;

public class ActiveMountainSensor implements IMountainSensor {
    @Override
    public void deploy() {
        System.out.println("ACTIVE MOUNTAIN Sensor is deploying seismic pulses.");
    }
}