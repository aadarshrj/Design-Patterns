package statePattern.exercise;

public class BICYCLING implements TravelState{
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
        return 2;
    }
}
