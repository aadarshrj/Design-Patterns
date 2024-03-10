package statePattern.exercise;

import java.util.HashMap;
import java.util.List;

public class DirectionService {
    private TravelState travelState;

    public Object getEta() {
      return travelState.getEta();
    }

    public Object getDirection() {
      return travelState.getDirection();
    }


    public TravelState getTravelState() {
        return travelState;
    }

    public void setTravelState(TravelState travelState) {
        this.travelState = travelState;
    }
}
