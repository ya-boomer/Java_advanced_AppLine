package CandyBox;

public class Jellybean extends DZ_3_sweetBox{
    private String forms;

    public Jellybean(String name, double weight, Double price, String forms) {
        super(name, weight, price);
        this.forms = forms;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }


    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", forms = " + forms +  "]";
    }
}
