class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int dayCount : this.birdsPerDay) {
            if (dayCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        for (int i = 0; i < Math.min(numberOfDays, this.birdsPerDay.length); i++) {
            result += this.birdsPerDay[i];
        }

        return result;
    }

    public int getBusyDays() {
        int count = 0;

        for (int dayCount : this.birdsPerDay) {
            if (dayCount >= 5) {
                count++;
            }
        }

        return count;
    }
}
