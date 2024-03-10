package statePattern.exercise;

public class TRANSIT implements TravelState{
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Transit)");
        return 3;
    }
}
