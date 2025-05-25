package src.controller;

 import src.analyzer.DangerAnalyzer;

 public class MonitoringController {
     private DangerAnalyzer analyzer;

     public MonitoringController(DangerAnalyzer analyzer) {
         this.analyzer = analyzer;
     }

     public void handleSensorInput(String data) {
         analyzer.analyze(data);
     }
 }