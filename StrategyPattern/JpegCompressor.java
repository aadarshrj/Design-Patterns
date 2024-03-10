package StrategyPattern;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.printf("Compressing using Jpeg");
    }
}
