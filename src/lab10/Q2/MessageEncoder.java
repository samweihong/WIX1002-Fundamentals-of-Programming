package lab10.Q2;

public interface MessageEncoder {
    String encode(String plainText);

    String decode(String cipherText);
}
