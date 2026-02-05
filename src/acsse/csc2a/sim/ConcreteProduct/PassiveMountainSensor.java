package acsse.csc2a.sim.ConcreteProduct;

import acsse.csc2a.sim.AbstractProduct.IMountainSensor;

public class PassiveMountainSensor implements IMountainSensor {
    @Override
    public void deploy() {
        System.out.println("PASSIVE MOUNTAIN Sensor is monitoring ambient conditions.");
    }
}