public class app {
    public static void main(String[] args) {


        IPlane plane = new Plane();

        plane.doActivity();
        System.out.println("-------------------");
        plane.enterToGarage();
        plane.doActivity();
        System.out.println("-------------------");
        plane.land();
        System.out.println("----------*---------");
        plane.getOutFromGarage();
        plane.fly();
        plane.doActivity();
    }
}
