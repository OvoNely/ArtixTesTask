public class Car extends Vehicle{

    private String driveType;
    private String color;

    public Car() {
        super("Автомобиль", 4, 150, 4);
        driveType = "Передний";
        color = "Белый";
    }

    public void print() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        System.out.println("Количество пассажиров: " + passengersNumber + " чел.");
        System.out.println("Количество колес: " + wheelsNumber);
        System.out.println("Тип привода: " + driveType);
        System.out.println("Цвет: " + color);
        System.out.println("--------------------------------");
    }

}
