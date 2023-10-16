package lab10.Q3;

import lab10.Q2.MessageEncoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShuffleCipher implements MessageEncoder {
    String inputFileName;
    String outputFileName;
    int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    public void plainToCipher() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine())
                outputStream.println(encode(inputStream.nextLine()));

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cipherToPlain() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine())
                outputStream.println(decode(inputStream.nextLine()));

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String encode(String plainText) {
        int half = plainText.length() / 2;
        String cipherText = plainText;
        for (int shuffle = 0; shuffle < N; shuffle++) {
            cipherText = "";
            for (int i = 0; i < half; i++)
                cipherText += "" + plainText.charAt(i) + plainText.charAt(i + half);
            if (plainText.length() % 2 == 1)
                cipherText += plainText.charAt(plainText.length() - 1);
            plainText = cipherText;
        }
        return cipherText;
    }

    @Override
    public String decode(String cipherText) {
        String plainText = cipherText;
        for (int shuffle = 0; shuffle < N; shuffle++) {
            plainText = "";
            for (int i = 0; i < cipherText.length() - 1; i += 2)
                plainText += cipherText.charAt(i);
            for (int i = 1; i < cipherText.length(); i += 2)
                plainText += cipherText.charAt(i);
            if (cipherText.length() % 2 == 1)
                plainText += cipherText.charAt(cipherText.length() - 1);
            cipherText = plainText;
        }
        return plainText;
    }
}
