/**
 * Created by User on 08.11.2016.
 */
public class Monkey extends Herbivorous {
    protected String climbingTrees;
    protected String suborder;
    protected Monkey(String name, String type, double age, double weight,
                     double g, double s, String climbingTrees, String suborder) {
        super(name, type, age, weight, g, s);
        this.climbingTrees = climbingTrees;
        this.suborder = suborder;
    }
}
