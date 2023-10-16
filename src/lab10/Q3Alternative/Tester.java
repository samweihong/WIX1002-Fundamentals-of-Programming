package lab10.Q3Alternative;

public class Tester {
    public static void main(String[] args) {
        ShuffleCipher plainToCipher = new ShuffleCipher("src/lab10/Q3Alternative/plainText.txt", "src/lab10/Q3Alternative/shuffleCipherText.txt", 2);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher("src/lab10/Q3Alternative/shuffleCipherText.txt", "src/lab10/Q3Alternative/shuffleDecodedText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
}
