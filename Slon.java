/**
 * Created by User on 08.11.2016.
 */
public class Slon extends Herbivorous {
    protected int numberTusks;  //количество бивней
    protected Slon(String name, String type, double age, double weight, double g,
         double s, int numberTusks) {
    super(name, type, age, weight, g, s);
    this.numberTusks = numberTusks;
    }
}
