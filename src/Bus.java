public class Bus extends Vehicle{

    private String gearType;
    private String color;

    public Bus() {
        super("Автобус", 6, 100, 60);
        gearType = "Автоматическая";
        color = "Желтый";
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Количество колес: " + wheelsNumber);
        System.out.println("Тип коробки передач: " + gearType);
        System.out.println("Цвет: " + color);
        System.out.println("--------------------------------");
    }

}
