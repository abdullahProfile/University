package src.analyzer;

import src.observer.Observer;
import java.util.*;

public class DangerAnalyzer {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void analyze(String input) {
        if (input.toLowerCase().contains("detected")) {
            notifyObservers(input);
        }
    }

    private void notifyObservers(String alert) {
        for (Observer o : observers) {
            o.update(alert);
        }
    }
}