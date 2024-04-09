public class Lasagna {
    public int expectedMinutesInOven() {
	return 40;
    }

    public int remainingMinutesInOven(int remaining) {
	return this.expectedMinutesInOven() - remaining;
    }

    public int preparationTimeInMinutes(int layers) {
	return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
	return preparationTimeInMinutes(layers) + minutes;
    }
}