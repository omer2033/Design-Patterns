package state.direction.Solution;

public class DirectionService {

    private ITransportation transportation;

    public void getEta() {
        transportation.getEta();
    }

    public void getDirection() {
        transportation.getDirection();
    }

    public ITransportation getTravelMode() {
        return transportation;
    }

    public void setTravelMode(ITransportation transportation) {
        this.transportation = transportation;
    }
}