package src.observer;

import javax.swing.*;

public class ParentDashboard implements Observer {
    private JTextArea logArea;

    public ParentDashboard(JTextArea logArea) {
        this.logArea = logArea;
    }

    public void update(String message) {
        logArea.append("[ALERT] " + message + "\n");
    }
}