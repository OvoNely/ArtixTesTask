public class TransportCreator {

    public void createTransport(int[] indexes) {

        for (int i = 0; i < indexes.length; i++) {

            switch (indexes[i]) {
                case 0:
                    Vehicle car = new Car();
                    car.print();
                    break;

                case 1:
                    Vehicle bus = new Bus();
                    bus.print();
                    break;

                case 2:
                    Vehicle truck = new Truck();
                    truck.print();
                    break;

                case 3:
                    Vehicle bicycle = new Bicycle();
                    bicycle.print();
                    break;

                case 4:
                    Aircraft airliner = new AirLiner();
                    airliner.print();
                    break;

                case 5:
                    Aircraft interceptor = new Interceptor();
                    interceptor.print();
                    break;

                case 6:
                    Aircraft helicopter = new Helicopter();
                    helicopter.print();
                    break;

                default:
                    System.out.println("\nНЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА\n");
                    break;
            }
        }
    }
}
