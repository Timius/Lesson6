/**
 * Created by User on 08.11.2016.
 */
public class Olen extends Herbivorous {
    protected String area;
    protected Olen(String name, String type, double age, double weight, double g,
          double s, String area) {
    super(name, type, age, weight, g, s);
    this.area=area;
    }
}
