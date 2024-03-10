package StrategyPattern;

public class ImageStorage {
    private FILETYPE compressor;
    private FILTER filter;

    public ImageStorage(FILETYPE compressor, FILTER filter) {
        this.compressor = compressor;
        this.filter = filter;
    }


    public void store(String fileName){
        if(compressor == FILETYPE.JPEG){
            System.out.printf("Compressing using JPEG");
        } else if (compressor == FILETYPE.PNG) {
            System.out.printf("Compressor using PNG");
        }
        if (filter == FILTER.BlackWhite){
            System.out.printf("Applying the B&W filter");
        }else if(filter == FILTER.HightContrast){
            System.out.printf("Applying the HIGH Contrast filter");
        }
    }
    enum FILETYPE{
        JPEG,PNG
    }
    enum FILTER{
        BlackWhite , HightContrast
    }
}
