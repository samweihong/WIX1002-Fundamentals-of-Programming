package lab10.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder {
    private String inputFileName;
    private String outputFileName;
    private int shift;

    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
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
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
            cipherText += (char) ((plainText.charAt(i) + shift) % 256);
        return cipherText;
    }

    @Override
    public String decode(String cipherText) {
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
            plainText += (char) ((cipherText.charAt(i) - shift) % 256);
        return plainText;
    }
}
