public abstract class Vehicle extends Transport{

    public int wheelsNumber;

    public Vehicle(String name, int wheelsNumber, int maxSpeed, int passengersNumber) {
        super(name, passengersNumber, passengersNumber);
        this.wheelsNumber = wheelsNumber;
        this.maxSpeed = maxSpeed;
        this.passengersNumber = passengersNumber;
    }

    public abstract void print();

}
