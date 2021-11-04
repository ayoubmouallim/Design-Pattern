public class Plane implements IPlane{


    private State state;

    public Plane() {
        this.state = new InTheTrack(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void enterToGarage() {
     state.enterToGarage();
    }

    @Override
    public void getOutFromGarage() {
state.getOutFromGarage();
    }

    @Override
    public void fly() {
       state.fly();
    }

    @Override
    public void land() {
   state.land();
    }

    @Override
    public void doActivity() {
         state.doActivity();
    }
}
