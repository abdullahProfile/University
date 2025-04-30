/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedecolator;

/**
 *
 * @author sp23-bse-116
 */


package filedecolator;

import java.io.*;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        
        // Ensure the directory exists
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();  // Create the parent directory if it doesn't exist
        }

        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println("Error writing data: " + ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);

        // Check if file exists before attempting to read
        if (!file.exists()) {
            System.out.println("File does not exist: " + name);
            return null;  // Return null if the file doesn't exist
        }

        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println("Error reading data: " + ex.getMessage());
        }
        
        return new String(buffer);
    }
}

