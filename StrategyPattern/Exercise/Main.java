package StrategyPattern.Exercise;

public class Main {
    public static void main(String[] args) {
        EncryptionAlgorithm encryptionAlgorithm = new AES();
        ChatClient client = new ChatClient(encryptionAlgorithm);

    }
}
