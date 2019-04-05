public class Dealers extends Person {
    public double rate;

    public Dealers(String name, int age, String occupation, int conto, double rate) {
        super(name, age, occupation, conto);
        this.rate = rate;
    }

    public void bigDeal(Sellers seller, Vehicles vehicle, Buyers buyer) {
        System.out.println();
        System.out.println("BIG DEAL: The buyer " + buyer.getName() + " wants to buy the vehicle from " + seller.getName());
        if (!vehicle.getOwner().equals(seller)) System.out.println("Seller is not the owner");
        else {
            if (buyer.getMoney() >= vehicle.getPrise()) {
                buyer.setMoney(buyer.getMoney() - vehicle.getPrise());
                seller.setMoney(seller.getMoney() + vehicle.getPrise() * (1 - rate));
                vehicle.setOwner(buyer);
                this.setMoney(this.getMoney() + vehicle.getPrise() * rate);
                System.out.println("The deal successfully comleted!");
                System.out.println(buyer.toString());
                System.out.println(vehicle.toString());
                System.out.println(seller.toString());
                System.out.println(this.toString());
            } else {
                System.out.println("Buyer " + buyer.getName() + " has no enough money for this deal!");
            }
        }
    }

    @Override
    public String toString() {
        return "Dealers{" +
                "rate=" + rate +
                ", name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", occupation='" + getOccupation() + '\'' +
                ", money=" + getMoney() +
                '}';
    }
}
