public abstract class State {

    protected Plane plane;

    public State(Plane plane) {
        this.plane = plane;
    }

    public abstract void enterToGarage();
    public abstract void getOutFromGarage();
    public abstract void fly();
    public abstract void land();
    public abstract void doActivity();
}
