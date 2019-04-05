public class FlyingVehicles extends Vehicles {
    public int height = 0;
    public boolean isFlying = true;

    public FlyingVehicles(int weight, int prise, Person owner, int height, boolean isFlying) {
        super(weight, prise, owner);
        this.height = height;
        this.isFlying = isFlying;
    }

    public void fly(boolean isFlying){
        if (isFlying == true) {
            height++;
        } else {
            height = 0;
        }
    }

}
