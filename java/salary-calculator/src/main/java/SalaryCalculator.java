public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped < 5) {
            return 1.0;
        }

        return 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        if (productsSold >= 20) {
            return 13;
        }

        return 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * this.bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return Math.min(2000.0, 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
    }
}
