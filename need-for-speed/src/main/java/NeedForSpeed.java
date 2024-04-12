class NeedForSpeed {
    private int speed;
    public int batteryDrain;
    private int mettersDriven;

    NeedForSpeed(int speed, int batteryDrain) {
	this.speed = speed;
	this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
	return batteryDrain == 0;
    }

    public int distanceDriven() {
	return mettersDriven;
    }

    public void drive() {
	batteryDrain = batteryDrain - speed;
	mettersDriven = mettersDriven + speed;
    }

    public static NeedForSpeed nitro() {
	return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
	this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
	car.drive();
	return car.distanceDriven() <= distance;
    }
}
