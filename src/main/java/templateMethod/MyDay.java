package templateMethod;

public class MyDay extends WorkDay{
    @Override
    protected void wayToWork(TransportType transportType) {
        switch (transportType){
            case CAR:
                System.out.println("Driving in a car");
                break;
            case TRAM:
                System.out.println("Driving by a tram");
                break;
            case BIKE:
                System.out.println("Ride by a bike");
        }
    }

    @Override
    protected int getTime(TransportType transportType) {
        switch (transportType){
            case CAR:
                return 15;
            case TRAM:
                return 25;
            case BIKE:
                return 45;
            default:
                return 0;
        }
    }

    @Override
    protected void work() {
        System.out.println("working");
    }

    @Override
    protected void timeWay(int time) {
        System.out.println("My way time: " + time);
    }
}
