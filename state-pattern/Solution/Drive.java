package state.direction.Solution;


public class Drive implements  ITransportation{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 2;
    }
}
