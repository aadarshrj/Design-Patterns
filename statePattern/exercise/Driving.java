package statePattern.exercise;

public class Driving implements TravelState{
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Driving)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Driving)");
        return 0;
    }
}
