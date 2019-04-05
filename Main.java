public class Main {
    public static void main(String[] args) {
        Sellers seller1 = new Sellers("Seller1", 23, "Teacher", 100);
        Sellers seller2 = new Sellers("Seller2", 25, "Doctor", 120);
        Buyers buyer1 = new Buyers("Buyer1", 30, "Doctor", 200);
        Buyers buyer2 = new Buyers("Buyer2", 30, "Doctor", 200);
        Buyers buyer3 = new Buyers("Buyer3", 30, "Doctor", 200);
        Dealers dealer1 = new Dealers("Dealer1", 34, "Dealer", 300, 0.1);
        //System.out.println(seller1);
       // System.out.println(seller2);
        Car car = new Car(150, 20,seller2, 0);
        Airplane airplane = new Airplane(700, 500, seller1,0, true);
        Helicopter helicopter = new Helicopter(600, 60, seller1, 0, true);
        dealer1.bigDeal(seller2, car, buyer1);
        System.out.println(car.getOwner());
        dealer1.bigDeal(seller1, airplane, buyer2);
        dealer1.bigDeal(seller1, helicopter, buyer3);
        System.out.println(seller1);
        dealer1.bigDeal(seller1, car, buyer2);
        System.out.println(seller1);
        System.out.println(car);




    }
}
