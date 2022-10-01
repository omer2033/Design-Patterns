package state.direction.Solution;


public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new Bicyle());
        directionService.getEta();
        directionService.getDirection();

        var directionService1 = new DirectionService();
        directionService.setTravelMode(new Walk());
        directionService.getEta();
        directionService.getDirection();

        var directionService2 = new DirectionService();
        directionService.setTravelMode(new Drive());
        directionService.getEta();
        directionService.getDirection();

        var directionService3 = new DirectionService();
        directionService.setTravelMode(new Transit());
        directionService.getEta();
        directionService.getDirection();
    }

}
