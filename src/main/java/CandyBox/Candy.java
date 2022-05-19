package CandyBox;

public class Candy extends DZ_3_sweetBox {
    private String size;


    public Candy(String name, double weight, Double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", size = " + size +  "]";
    }
}
