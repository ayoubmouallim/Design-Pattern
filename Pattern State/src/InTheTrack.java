public class InTheTrack extends State{

    public InTheTrack(Plane plane) {
        super(plane);
    }

    @Override
    public void enterToGarage() {

        System.out.println("Change the state : from Track ==>  Garage");
         plane.setState( new InTheGarage(plane));

    }

    @Override
    public void getOutFromGarage() {
        System.out.println("Impossible i am in the Track not in the Garage");
    }

    @Override
    public void fly() {
        System.out.println("Change the state : from Track ==>  Air");
        plane.setState( new InTheAir(plane));
    }

    @Override
    public void land() {
        System.out.println("Impossible i am in the Track not in the Air");

    }

    @Override
    public void doActivity() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Activity of the state Track "+i);

        }
    }
}
