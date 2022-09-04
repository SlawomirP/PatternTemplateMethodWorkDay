package templateMethod;

public abstract class WorkDay {

    public final void dayStart(TransportType transportType){

        wakeUp();
        shower();
        breakfast();
        wayToWork(transportType);
        int timeWayToWork = getTime(transportType);
        timeWay(timeWayToWork);
        work();
    }

    //metody private, niezmienne
    private void breakfast() {
        System.out.println("eat");
    }

    private void shower() {
        System.out.println("shower");
    }

    private void wakeUp() {
        System.out.println("wake up");
    }

    protected abstract void wayToWork(TransportType transportType);
    protected abstract int getTime(TransportType transportType);
    protected abstract void work();
    protected abstract void timeWay(int time);
}
