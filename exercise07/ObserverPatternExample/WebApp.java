package exercise07.ObserverPatternExample;

public class WebApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println(
                "Web App Notification -> "
                        + stockName
                        + " Price Updated: Rs."
                        + price);
    }
}