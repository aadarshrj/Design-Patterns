package ObserverPattern.Exercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements StockObserver {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        System.out.println("Stock is updated::");
    }
}
