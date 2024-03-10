package statePattern.exercise;

public class Walking implements TravelState{
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Walking)");
        return 4;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Walking)");
        return 4;
    }
}
