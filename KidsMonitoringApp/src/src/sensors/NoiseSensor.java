package src.sensors;

import src.controller.MonitoringController;

public class NoiseSensor implements Sensor {
    private MonitoringController controller;

    public NoiseSensor(MonitoringController controller) {
        this.controller = controller;
    }

    public void sendData() {
        controller.handleSensorInput("Loud noise detected!");
    }
}