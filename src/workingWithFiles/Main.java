package workingWithFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        createBackup();
        int[] gameField = {0, 1, 2, 0, 1, 0, 2, 3, 0}; // Пример состояния поля
        writeGameFieldToFile(gameField, "gameField.dat");
    }

    private static void createBackup() {
        File currentDir = new File(".");
        File backupDir = new File(currentDir, "backup");

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        File[] files = currentDir.listFiles(file -> file.isFile());
        if (files != null) {
            for (File file : files) {
                try {
                    Files.copy(file.toPath(), Paths.get(backupDir.getPath(), file.getName()));
                } catch (IOException e) {
                    System.err.println("Ошибка при копировании файла: " + file.getName());
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeGameFieldToFile(int[] gameField, String fileName) {
        if (gameField.length != 9) {
            throw new IllegalArgumentException("Массив должен содержать ровно 9 элементов.");
        }

        try {
            byte[] bytes = new byte[3];

            bytes[0] = (byte) ((gameField[0] & 0x03) | ((gameField[1] & 0x03) << 2) | ((gameField[2] & 0x03) << 4));
            bytes[1] = (byte) ((gameField[3] & 0x03) | ((gameField[4] & 0x03) << 2) | ((gameField[5] & 0x03) << 4));
            bytes[2] = (byte) ((gameField[6] & 0x03) | ((gameField[7] & 0x03) << 2) | ((gameField[8] & 0x03) << 4));

            Files.write(Paths.get(fileName), bytes);
            System.out.println("Состояние поля записано в файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
