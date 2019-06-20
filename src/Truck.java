public class Truck extends Vehicle {

    private int tonnage;
    private String fuelType;

    public Truck() {
        super("Truck", 10, 120, 3);
        tonnage = 20;
        fuelType = "Дизельное топливо";
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Количество колес: " + wheelsNumber);
        System.out.println("Грузоподъемность: " + tonnage + " тонн");
        System.out.println("Тип топлива: " + fuelType);
        System.out.println("--------------------------------");
    }

}
