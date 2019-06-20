public abstract class Aircraft extends Transport{

    public int maxFlightDistance;

    public Aircraft(String name, int maxSpeed, int passengersNumber, int maxFlightDistance) {
        super(name, maxFlightDistance, maxFlightDistance);
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.passengersNumber = passengersNumber;
    }

    public abstract void print();

}
