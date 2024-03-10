package StrategyPattern.Exercise;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
       encryptionAlgorithm.encrypting(message);
        System.out.println("Sending the message >>>");
        System.out.printf("");
    }
}
