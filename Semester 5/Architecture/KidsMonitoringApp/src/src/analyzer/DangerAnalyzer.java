package src.analyzer;

import src.observer.Observer;
import src.notification.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class DangerAnalyzer {
    private List<Observer> observers = new ArrayList<>();
    private NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // This method is called to analyze each sensor data string
    public void analyze(String data) {
        String alert = null;

        if (data.contains("Motion")) {
            alert = "[ALERT] Motion detected!";
        } else if (data.contains("Noise")) {
            alert = "[ALERT] Loud noise detected!";
        } else if (data.contains("Temperature")) {
            alert = "[ALERT] High temperature detected!";
        } else if (data.contains("Camera")) {
            alert = "[ALERT] Suspicious activity detected by camera!";
        }

        if (alert != null) {
            notifyObservers(alert);

            // Notify stakeholders as well
            if (notificationService != null) {
                notificationService.notifyStakeholders(alert);
            }
        }
    }

    private void notifyObservers(String alert) {
        for (Observer o : observers) {
            o.update(alert);
        }
    }
}
