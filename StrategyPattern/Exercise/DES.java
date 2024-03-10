package StrategyPattern.Exercise;

public class DES implements EncryptionAlgorithm{
    @Override
    public void encrypting(String message) {
        System.out.println("Applied the DES encrypting algorithm on the message::"+message);
    }
}
