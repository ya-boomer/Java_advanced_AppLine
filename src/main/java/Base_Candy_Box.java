import CandyBox.Candy;
import CandyBox.Jellybean;
import CandyBox.Marshmallow;
import CandyBox.DZ_3_sweetBox;

public class Base_Candy_Box {
    public static void main(String[] args) {
        double sumPrice = 0;
        double sumWeight = 0;
        double sumWeight1 = 0;
        Candy candy1 = new Candy("lollipops", 100.0, 250.0, "small");
        Candy candy2 = new Candy("chocolate", 300.0, 450.0, "average");
        Jellybean jellybean1 = new Jellybean("jellybean1", 200.0, 100.0, "bear");
        Jellybean jellybean2 = new Jellybean("jellybean2", 300.0, 120.0, "worm");
        Marshmallow marshmallow1 = new Marshmallow("Marshmallow1", 220.0, 130.5, "yellow");
        Marshmallow marshmallow2 = new Marshmallow("Marshmallow2", 380.0, 185.5, "white");
        DZ_3_sweetBox[] box = {candy1, candy2, jellybean1, jellybean2, marshmallow1, marshmallow2};
        for (DZ_3_sweetBox someSweet : box) {
            sumWeight1 += someSweet.getWeight();
            sumPrice += someSweet.getPrice();
            System.out.println(someSweet.toString());
        }
        System.out.println("Общий вес = " + sumWeight1);
        System.out.println("Общая цена = " + sumPrice);

    }
}
