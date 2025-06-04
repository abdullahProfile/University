package chatBot.scanner;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class PeerA {
    private static final String SECRET_KEY = "1234567812345678";
    private static final String HOST = "127.0.0.1"; // localhost
    private static final int PORT = 5000; // Port Peer B is listening on

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message to send: ");
        String message = scanner.nextLine();

        try (Socket socket = new Socket(HOST, PORT)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String encryptedMessage = encrypt(message);
            out.println(encryptedMessage);
            System.out.println("Message sent (encrypted).");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static String encrypt(String plainText) {
        try {
            SecretKey secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Encryption error", e);
        }
    }
}
