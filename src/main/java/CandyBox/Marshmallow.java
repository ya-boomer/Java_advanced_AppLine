package CandyBox;

public class Marshmallow extends DZ_3_sweetBox{
    private String color;

    public Marshmallow(String name, double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "Marshmallow [" + super.toString() + ", color = " + color +  "]";
    }
}
