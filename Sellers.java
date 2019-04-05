public class Sellers extends Person {


    public Sellers(String name, int age, String occupation, int conto) {
        super(name, age, occupation, conto);
    }

    @Override
    public String toString() {
        return "Sellers{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", occupation='" + getOccupation() + '\'' +
                ", money=" + getMoney() +
                '}';
    }
}
