/**
 * Created by User on 08.11.2016.
 */
public class Tiger extends Predator {
    protected String area; //место обитания
    protected Tiger(String name, String type, double age, double weight,
                    String suborder, double strong, double speed, String area) {
        super(name, type, age, weight, suborder, strong, speed);
    this.area=area;
    }
}
