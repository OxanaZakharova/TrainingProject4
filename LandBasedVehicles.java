public class LandBasedVehicles extends Vehicles {
    public int kmCounter = 0;

    public LandBasedVehicles(int weight, int prise, Person owner, int kmCounter) {
        super(weight, prise, owner);
        this.kmCounter = kmCounter;
    }

    public int drive(int kms){
        kmCounter += kms;
        return kmCounter;
    }


}
