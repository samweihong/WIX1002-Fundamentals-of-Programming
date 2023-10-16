package lab10.Q2;

public class Tester {
    public static void main(String[] args) {
        SubstitutionCipher plainToCipher = new SubstitutionCipher("src/lab10/Q2/plainText.txt", "src/lab10/Q2/cipherText.txt", 2);
        plainToCipher.plainToCipher();

        SubstitutionCipher cipherToPlain = new SubstitutionCipher("src/lab10/Q2/cipherText.txt", "src/lab10/Q2/decodedPlainText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
}
