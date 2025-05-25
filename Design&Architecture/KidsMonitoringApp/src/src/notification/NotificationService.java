package src.notification;

import javax.swing.*;

public class NotificationService {
    private JTextArea logArea;

    public NotificationService(JTextArea logArea) {
        this.logArea = logArea;
    }

    public void notifyStakeholders(String alertMessage) {
        String notification;

        if (alertMessage.contains("High temperature")) {
            notification = "[NOTIFICATION] Fire Brigade contacted due to fire alert!";
        } else if (alertMessage.contains("Motion detected")) {
            notification = "[NOTIFICATION] Parents notified of motion detection!";
        } else if (alertMessage.contains("Loud noise")) {
            notification = "[NOTIFICATION] Security team notified of loud noise!";
        } else if (alertMessage.contains("Suspicious activity")) {
            notification = "[NOTIFICATION] Security team notified of suspicious camera activity!";
        } else {
            notification = "[NOTIFICATION] General alert notification sent.";
        }

        SwingUtilities.invokeLater(() -> logArea.append(notification + "\n"));
    }
}
