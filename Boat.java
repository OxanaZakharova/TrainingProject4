public class Boat extends WaterBasedVehicles {

    public Boat(int weight, int prise, Person owner, double xGPS, double yGPS) {
        super(weight, prise, owner, xGPS, yGPS);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "xGPS=" + xGPS +
                ", yGPS=" + yGPS +
                ", weight=" + getWeight() +
                ", prise=" +getPrise() +
                ", owner=" + getOwner() +
                '}';
    }
}
