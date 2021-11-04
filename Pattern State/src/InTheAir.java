public class InTheAir extends State{


    public InTheAir(Plane plane) {
        super(plane);
    }

    @Override
    public void enterToGarage() {
        System.out.println("Impossible i am in the Air ");

    }

    @Override
    public void getOutFromGarage() {
        System.out.println("Impossible i am in the Air ");

    }

    @Override
    public void fly() {
        System.out.println("Impossible i am in the Air ");

    }

    @Override
    public void land() {
        System.out.println("Change the state : from Air ==>  Track");
        plane.setState( new InTheTrack(plane));
    }

    @Override
    public void doActivity() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Activity of the state Air "+i);

        }
    }
}
