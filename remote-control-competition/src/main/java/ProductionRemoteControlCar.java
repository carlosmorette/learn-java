class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distanceTravelled = 0;
    int numberOfVictories = 0;
    
    public void drive() {
	distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
	return distanceTravelled;
    }

    public int getNumberOfVictories() {
	return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
	this.numberOfVictories += numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar a) {
	return Integer.compare(a.getNumberOfVictories(), getNumberOfVictories());
    }
}
