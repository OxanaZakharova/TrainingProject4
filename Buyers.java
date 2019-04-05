public class Buyers extends Person {

    public Buyers(String name, int age, String occupation, int conto) {
        super(name, age, occupation, conto);
    }

    @Override
    public String toString() {
        return "Buyers{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", occupation='" + getOccupation() + '\'' +
                ", money=" + getMoney() +
                '}';
    }
}
