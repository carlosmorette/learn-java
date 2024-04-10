import java.text.MessageFormat;

public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
	return new ElonsToyCar();
    }

    public String distanceDisplay() {
	return String.format("Driven %s meters", distance);
    }

    public String batteryDisplay() {
	return battery == 0 ? "Battery empty" : MessageFormat.format("Battery at {0}%", battery);
    }

    public void drive() {
	battery = battery == 0 ? battery : battery - 1;
	distance = distance == 2000 ? distance : distance + 20;
    }
}
