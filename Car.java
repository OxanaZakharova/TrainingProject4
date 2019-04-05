public class Car extends LandBasedVehicles {

    public Car(int weight, int prise, Person owner, int kmCounter) {
        super(weight, prise, owner, kmCounter);
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + getWeight() +
                ", prise=" +getPrise() +
                ", owner=" + getOwner() +
                '}';
    }
}
