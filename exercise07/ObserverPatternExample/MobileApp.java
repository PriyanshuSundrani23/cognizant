package exercise07.ObserverPatternExample;

public class MobileApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println(
                "Mobile App Notification -> "
                        + stockName
                        + " Price Updated: Rs."
                        + price);
    }
}