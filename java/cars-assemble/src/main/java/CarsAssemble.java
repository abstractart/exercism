public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int rate = 221;
        return this.getSuccessRate(speed) * speed * rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed) / 60);
    }

    private double getSuccessRate(int speed) {
        if (speed > 0 && speed < 5) {
            return 1.0;
        }

        if (speed >= 5 && speed < 9) {
            return 0.9;
        }

        if (speed == 9) {
            return 0.8;
        }

        return 0.77;
    }
}
