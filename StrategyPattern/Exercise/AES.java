package StrategyPattern.Exercise;

public class AES implements EncryptionAlgorithm{
    @Override
    public void encrypting(String message) {
        System.out.println("Applied the AES encrypting algorithm on the message::"+message);
    }
}
