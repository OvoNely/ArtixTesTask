public class AirLiner extends Aircraft{

    private String model;
    private String company;

    public AirLiner() {
        super("Авиалайнер", 950, 160, 5400);
        model = "Boing 737-800";
        company = "Lufthansa";
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Дальность полета: " + maxFlightDistance + " км");
        System.out.println("Модель: " + model);
        System.out.println("Авиакомпания: " + company);
        System.out.println("--------------------------------");
    }

}
