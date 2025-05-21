package src.sensors;

import src.controller.MonitoringController;

public class MotionSensor implements Sensor {
    private MonitoringController controller;

    public MotionSensor(MonitoringController controller) {
        this.controller = controller;
    }

    public void sendData() {
        controller.handleSensorInput("Motion detected!");
    }
}