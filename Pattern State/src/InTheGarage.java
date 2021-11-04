public class InTheGarage extends State{

    public InTheGarage(Plane plane) {
        super(plane);
    }

    @Override
    public void enterToGarage() {

        System.out.println("Impossible i am already in the Garage");
    }

    @Override
    public void getOutFromGarage() {
        System.out.println("Change the state : from Garage ==>  Track");
        plane.setState( new InTheTrack(plane));    }

    @Override
    public void fly() {
        System.out.println("Impossible i should get out from the garage first");

    }

    @Override
    public void land() {
        System.out.println("Impossible i am int the Garage, not in the Air ");

    }

    @Override
    public void doActivity() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Activity of the state Garage "+i);

        }
    }
}
