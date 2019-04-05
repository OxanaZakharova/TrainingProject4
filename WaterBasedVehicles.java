public class WaterBasedVehicles extends Vehicles {
    public double xGPS = 0, yGPS = 0;

    public WaterBasedVehicles(int weight, int prise, Person owner, double xGPS, double yGPS) {
        super(weight, prise, owner);
        this.xGPS = xGPS;
        this.yGPS = yGPS;
    }

    public void go(){
        xGPS = Math.random()*xGPS;
        yGPS = Math.random()*yGPS;

    }
}
