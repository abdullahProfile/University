package src.sensors;

import src.controller.MonitoringController;

public class CameraSensor implements Sensor {
    private MonitoringController controller;

    public CameraSensor(MonitoringController controller) {
        this.controller = controller;
    }

    public void sendData() {
        controller.handleSensorInput("Suspicious activity detected by camera!");
    }
}