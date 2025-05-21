package src.sensors;

import src.controller.MonitoringController;

public class HeatSensor implements Sensor {
    private MonitoringController controller;

    public HeatSensor(MonitoringController controller) {
        this.controller = controller;
    }

    public void sendData() {
        controller.handleSensorInput("High temperature detected!");
    }
}