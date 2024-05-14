package ObserverPattern.Exercise;

import java.util.ArrayList;
import java.util.List;

public class StockSubject {
    private List<StockObserver> lis = new ArrayList<>();

    public void addObserver(StockObserver stockObserver){
        lis.add(stockObserver);
    }
    public void removeObserver(StockObserver stockObserver){
        lis.remove(stockObserver);
    }
    public void notifyAllObserver(){
        for (StockObserver sb : lis){
            sb.update();
        }
    }
}
