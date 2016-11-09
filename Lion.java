/**
 * Created by User on 08.11.2016.
 */
public class Lion extends Predator{
    protected String liveInPraide;
    protected Lion(String name, String type, double age, double weight,
                   String suborder, double strong, double speed, String liveInPraide) {
        super(name, type, age, weight, suborder, strong, speed);
        this.liveInPraide = liveInPraide;
    }
}
