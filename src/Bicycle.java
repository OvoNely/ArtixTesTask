public class Bicycle extends Vehicle{

    private String frameMaterial;
    private int speedsNumber;

    public Bicycle() {
        super("Велосипед", 2, 40, 1);
        frameMaterial = "Карбон";
        speedsNumber = 12;
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Количество колес: " + wheelsNumber);
        System.out.println("Рама: " + frameMaterial);
        System.out.println("Количество передач: " + speedsNumber);
        System.out.println("--------------------------------");
    }

}
