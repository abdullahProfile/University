package src.ui;

import src.controller.MonitoringController;
import src.analyzer.DangerAnalyzer;
import src.observer.ParentDashboard;
import src.sensors.*;
import src.notification.NotificationService;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MonitoringUI extends JFrame {
    public MonitoringUI() {
        setTitle("Kids Monitoring App");
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(240, 248, 255));
        add(mainPanel);

        JLabel titleLabel = new JLabel("Kids Monitoring System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 26));
        titleLabel.setForeground(new Color(33, 37, 41));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 20, 0));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JTextArea logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        logArea.setBackground(new Color(255, 255, 255));
        logArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Alerts Log"));
        scrollPane.setPreferredSize(new Dimension(500, 300));
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        DangerAnalyzer analyzer = new DangerAnalyzer();
        MonitoringController controller = new MonitoringController(analyzer);
        ParentDashboard dashboard = new ParentDashboard(logArea);
        analyzer.registerObserver(dashboard);

        NotificationService notificationService = new NotificationService(logArea);
        analyzer.setNotificationService(notificationService);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(240, 248, 255));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JButton simulateButton = new JButton("Simulate Sensors");
        simulateButton.setBackground(new Color(30, 144, 255));
        simulateButton.setForeground(Color.WHITE);
        simulateButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        simulateButton.setFocusPainted(false);
        simulateButton.setPreferredSize(new Dimension(200, 40));
        simulateButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        simulateButton.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 204), 1));
        simulateButton.setOpaque(true);

        simulateButton.addActionListener(e -> simulateSensors(controller));

        buttonPanel.add(simulateButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // --- Automatic real-time simulation every 5 seconds ---
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                simulateSensors(controller);
            }
        }, 0, 5000);  // Starts immediately, repeats every 5000 ms

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void simulateSensors(MonitoringController controller) {
        Sensor motion = new MotionSensor(controller);
        Sensor noise = new NoiseSensor(controller);
        Sensor heat = new HeatSensor(controller);
        Sensor camera = new CameraSensor(controller);

        motion.sendData();
        noise.sendData();
        heat.sendData();
        camera.sendData();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MonitoringUI::new);
    }
}
