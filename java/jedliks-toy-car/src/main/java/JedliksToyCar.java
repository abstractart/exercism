public class JedliksToyCar {
    private int batteryLevel = 100;
    private int distanceInMeters = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distanceInMeters);
    }

    public String batteryDisplay() {
        if (batteryLevel == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", this.batteryLevel);
    }

    public void drive() {
        if (batteryLevel == 0) {
            return;
        }
        this.batteryLevel--;
        this.distanceInMeters += 20;
    }
}
