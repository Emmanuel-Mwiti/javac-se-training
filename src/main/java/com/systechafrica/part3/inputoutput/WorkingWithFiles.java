package com.systechafrica.part3.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkingWithFiles {
  private static String property;

  public static void main(String[] args) throws IOException {
    // workingWithFiles();
    workingWithFileStreams();

  }

  private static void workingWithFileStreams() {
    String fileSeparator = System.getProperty("file.separator");
    File quoteFile = new File("java-se-training" + fileSeparator + "quotes.txt");
    if (quoteFile.exists() && quoteFile.isFile()) {
      try (
          BufferedReader bufferedReader = new BufferedReader(new FileReader(quoteFile));
          Scanner scanner = new Scanner(System.in)) {
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
          lines.add(line);
        }

        System.out.print("Enter a number between 1 and 10 to get inspiration quotes: ");
        int quoteIndex = scanner.nextInt();
        System.out.println(lines.get(quoteIndex - 1));
      } catch (IOException e) {
        System.err.println(e.getMessage());
      }

    }

  }

  private static void workingWithFiles() throws IOException {
    // String absolutePath = "C:\\manu\\JAVA_Systech\\Java
    // Training\\java-se-training\\java-se-training\\src\\main\\java\\com\\systechafrica\\part3\\inputoutput\\WorkingWithFiles.java";
    // String relativePath =
    // "java-se-training\\src\\main\\java\\com\\systechafrica\\part3\\inputoutput\\WorkingWithFiles.java";
    // System.out.println(property);
    // File logFile = new File("C:\\manu\\JAVA_Systech\\Java
    // Training\\java-se-training\\java-se-training\\log.txt");
    // System.out.println(logFile.isFile());
    // System.out.println(logFile.exists());
    // System.out.println(logFile.isDirectory());
    // System.out.println(Instant.ofEpochMilli(logFile.lastModified()));

    File baseDirectory = new File("C:\\manu\\JAVA_Systech\\Java Training\\java-se-training\\java-se-training");
    File tempFile = new File(baseDirectory, "tmp");
    tempFile.mkdir();
    File logFileTwo = new File(tempFile, "log");
    logFileTwo.createNewFile();
    File[] listFiles = baseDirectory.listFiles();
    for (File file : listFiles) {
      System.out.println(file.getName());
    }
    // logFileTwo.delete();
    File temporaryLog = new File(tempFile + property + "newTemporaryFile.txt");
    logFileTwo.renameTo(temporaryLog);
  }
}
