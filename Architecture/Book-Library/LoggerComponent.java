import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LoggerComponent implements Logger {
    private List<String> logs = new ArrayList<>();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void log(String message) {
        String logEntry = message + " at " + LocalDateTime.now().format(FORMATTER);
        logs.add(logEntry);
        System.out.println("[LOG]: " + logEntry);
    }

    public List<String> getLogs() {
        return logs;
    }
}
