public class Vehicles {
    private int weight;
    private int prise;
    private Person owner;

    public Vehicles(int weight, int prise, Person owner) {
        this.weight = weight;
        this.prise = prise;
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrise() {
        return prise;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "weight=" + weight +
                ", prise=" + prise +
                ", owner=" + owner +
                '}';
    }
}
