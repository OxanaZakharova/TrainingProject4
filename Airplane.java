public class Airplane extends FlyingVehicles {

    public Airplane(int weight, int prise, Person owner, int height, boolean isFlying) {
        super(weight, prise, owner, height, isFlying);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "weight=" + getWeight() +
                ", prise=" +getPrise() +
                ", owner=" + getOwner() +
                '}';
    }
}
