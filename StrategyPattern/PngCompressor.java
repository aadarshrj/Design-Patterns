package StrategyPattern;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using the PNG Compressor");
    }
}
