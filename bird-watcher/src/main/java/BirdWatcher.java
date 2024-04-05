class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
	return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
	int lastItemIndex = birdsPerDay.length - 1;
	return birdsPerDay[lastItemIndex];
    }

    public void incrementTodaysCount() {
	int lastItemIndex = birdsPerDay.length - 1;
        birdsPerDay[lastItemIndex]++;
    }

    public boolean hasDayWithoutBirds() {
	for (int bpd: birdsPerDay) {
	    if (bpd == 0) return true;
	}

	return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
	int acc = 0;
	
	for (int i = 0; i < numberOfDays; i++) {
	    if (i <= birdsPerDay.length - 1) {
		acc = acc + birdsPerDay[i];
	    }
	}

	return acc;
    }

    public int getBusyDays() {
	int busyDays = 0;
	
	for (int bpd: this.birdsPerDay) {
	    System.out.println(bpd);
	    if (bpd >= 5) busyDays = busyDays + 1;
	}

	return busyDays;
    }
}
