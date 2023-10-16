package lab10.Q3;

public class Tester {
    public static void main(String[] args) {
        ShuffleCipher plainToCipher = new ShuffleCipher("src/lab10/Q3/plainText.txt", "src/lab10/Q3/shuffleCipherText.txt", 2);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher("src/lab10/Q3/shuffleCipherText.txt", "src/lab10/Q3/shuffleDecodedText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
}
