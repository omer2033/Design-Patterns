package state.direction.Solution;

public class Bicyle implements  ITransportation {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Bicycling)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
        return 1;
    }
}
