import com.fazecast.jSerialComm.SerialPort;
import java.util.Scanner;

public class LineFollowerBot {
    public static void main(String[] args) {

        // Connect to Arduino
        SerialPort serialPort = SerialPort.getCommPort("COM3"); // Replace "COM3" with your Arduino's port
        serialPort.setBaudRate(9600);

        if (!serialPort.openPort()) {
            System.out.println("Failed to connect to Arduino.");
            return;
        }
        System.out.println("Connected to Arduino.");

        // Create a thread to read sensor data from Arduino
        Thread sensorThread = new Thread(() -> {
            Scanner scanner = new Scanner(serialPort.getInputStream());
            try {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println("Sensor Data: " + line);

                    // Parse sensor data
                    String[] sensorValues = line.split(",");
                    int left = Integer.parseInt(sensorValues[0].trim());
                    int center = Integer.parseInt(sensorValues[1].trim());
                    int right = Integer.parseInt(sensorValues[2].trim());

                    // Decide command based on sensor readings
                    if (center > 500) {
                        serialPort.getOutputStream().write('F');
                    } else if (left > 500) {
                        serialPort.getOutputStream().write('L');
                    } else if (right > 500) {
                        serialPort.getOutputStream().write('R');
                    } else {
                        serialPort.getOutputStream().write('S'); // Stop if no line is detected
                    }
                    serialPort.getOutputStream().flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            scanner.close();
        });
        sensorThread.start();
    }
}