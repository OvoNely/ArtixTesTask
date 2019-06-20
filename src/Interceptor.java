public class Interceptor extends Aircraft{

    private int airToGroundRockets;
    private int airToAirRockets;

    public Interceptor() {
        super("Истребитель", 2700, 2, 4500);
        airToGroundRockets = 4;
        airToAirRockets = 8;
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Дальность полета: " + maxFlightDistance + " км");
        System.out.println("Количество рокет \"воздух-земля\": " + airToGroundRockets);
        System.out.println("Количество рокет \"воздух-воздух\": " + airToAirRockets);
        System.out.println("--------------------------------");
    }

}
