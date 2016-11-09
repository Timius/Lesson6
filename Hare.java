/**
 * Created by User on 08.11.2016.
 */
public class Hare extends Herbivorous { //заяц
    protected String changColor;  //меняет цвет шубы
    protected Hare(String name, String type, double age, double weight, double g,
                   double s, String changColor) {
        super(name, type, age, weight, g, s);
        this.changColor = changColor;
    }
}
