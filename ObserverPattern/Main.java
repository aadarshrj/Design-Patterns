package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        DataSource ds = new DataSource();
        SpreadSheet sheet = new SpreadSheet();
        SpreadSheet sheet2 = new SpreadSheet();
        Chart chart = new Chart();

        ds.addObserver(sheet);
        ds.addObserver(sheet2);
        ds.addObserver(chart);

        ds.setValue(23);
    }
}
