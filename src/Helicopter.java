public class Helicopter extends Aircraft {

    private int tonnage;
    private int fuelCapacity;

    public Helicopter() {
        super("Вертолет", 380, 20, 1100);
        tonnage = 9300;
        fuelCapacity = 2400;
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Дальность полета: " + maxFlightDistance + " км");
        System.out.println("Грузоподъемность: " + tonnage + " тонн");
        System.out.println("Вместимость топливного бака: " + fuelCapacity + " л");
        System.out.println("--------------------------------");
    }

}
