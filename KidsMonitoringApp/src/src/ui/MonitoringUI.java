package src.ui;

import src.controller.MonitoringController;
import src.analyzer.DangerAnalyzer;
import src.observer.ParentDashboard;
import src.sensors.*;

import javax.swing.*;
import java.awt.*;

public class MonitoringUI extends JFrame {
    private volatile boolean realTimeMonitoring = false; // flag to stop thread if needed

    public MonitoringUI() {
        setTitle("Kids Monitoring App");
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Background Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255));
        add(mainPanel);

        // Title
        JLabel titleLabel = new JLabel("Kids Monitoring System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 26));
        titleLabel.setForeground(new Color(33, 37, 41));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 20, 0));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Log Area
        JTextArea logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        logArea.setBackground(new Color(255, 255, 255));
        logArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Alerts Log"));
        scrollPane.setPreferredSize(new Dimension(500, 300));
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Controller and Observer setup
        DangerAnalyzer analyzer = new DangerAnalyzer();
        MonitoringController controller = new MonitoringController(analyzer);
        ParentDashboard dashboard = new ParentDashboard(logArea);
        analyzer.registerObserver(dashboard);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(240, 248, 255));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        // Simulate Sensors Button (original)
        JButton simulateButton = new JButton("Simulate Sensors");
        simulateButton.setBackground(new Color(30, 144, 255));
        simulateButton.setForeground(Color.WHITE);
        simulateButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        simulateButton.setFocusPainted(false);
        simulateButton.setPreferredSize(new Dimension(200, 40));
        simulateButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        simulateButton.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 204), 1));
        simulateButton.setOpaque(true);

        simulateButton.addActionListener(e -> {
            Sensor motion = new MotionSensor(controller);
            Sensor noise = new NoiseSensor(controller);
            Sensor heat = new HeatSensor(controller);
            Sensor camera = new CameraSensor(controller);

            motion.sendData();
            noise.sendData();
            heat.sendData();
            camera.sendData();
        });

        buttonPanel.add(simulateButton);

        // Real-Time Monitoring Button (NEW)
        JButton realtimeButton = new JButton("Start Real-Time Monitoring");
        realtimeButton.setBackground(new Color(50, 205, 50));
        realtimeButton.setForeground(Color.WHITE);
        realtimeButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        realtimeButton.setFocusPainted(false);
        realtimeButton.setPreferredSize(new Dimension(250, 40));
        realtimeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        realtimeButton.setBorder(BorderFactory.createLineBorder(new Color(34, 139, 34), 1));
        realtimeButton.setOpaque(true);

        realtimeButton.addActionListener(e -> {
            if (!realTimeMonitoring) {
                realTimeMonitoring = true;
                realtimeButton.setText("Stop Real-Time Monitoring");
                // Start thread for real-time simulation
                new Thread(() -> {
                    while (realTimeMonitoring) {
                        try {
                            // Simulate real-time data arrival every 5 seconds
                            Thread.sleep(5000);

                            // Create sensors and send data (random or pattern can be added)
                            Sensor motion = new MotionSensor(controller);
                            Sensor noise = new NoiseSensor(controller);
                            Sensor heat = new HeatSensor(controller);
                            Sensor camera = new CameraSensor(controller);

                            motion.sendData();
                            noise.sendData();
                            heat.sendData();
                            camera.sendData();

                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                            break;
                        }
                    }
                }).start();
            } else {
                // Stop real-time monitoring
                realTimeMonitoring = false;
                realtimeButton.setText("Start Real-Time Monitoring");
            }
        });

        buttonPanel.add(realtimeButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Center the frame on screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MonitoringUI::new);
    }
}
