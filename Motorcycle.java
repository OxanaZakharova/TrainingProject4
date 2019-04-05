public class Motorcycle extends LandBasedVehicles {

    public Motorcycle(int weight, int prise, Person owner, int kmCounter) {
        super(weight, prise, owner, kmCounter);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "weight=" + getWeight() +
                ", prise=" +getPrise() +
                ", owner=" + getOwner() +
                '}';
    }
}

