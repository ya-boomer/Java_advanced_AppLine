/* Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 */
package CandyBox;

public abstract class DZ_3_sweetBox {

    private String name;
    private double weight;
    private double price;

    public DZ_3_sweetBox(String name, double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name + ", weight: " + weight + ", price: " + price;
    }

}
