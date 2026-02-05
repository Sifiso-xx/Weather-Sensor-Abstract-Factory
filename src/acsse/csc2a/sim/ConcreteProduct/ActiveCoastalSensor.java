package acsse.csc2a.sim.ConcreteProduct;

import acsse.csc2a.sim.AbstractProduct.ICoastalSensor;

public class ActiveCoastalSensor implements ICoastalSensor {
    @Override
    public void deploy() {
        System.out.println("ACTIVE COASTAL Sensor is measuring wave dynamics.");
    }
}