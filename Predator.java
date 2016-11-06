import java.util.Random;

/**
 * Created by User on 26.10.2016.
 */
public class Predator extends Animal {
    //   имя, тип, возраст, вес унаследовал от класса животные
    protected String suborder;   //подотряд псовые или кошачьи
    protected double strong;
    protected double speed;

    protected Predator(String name, String type, double age,
                       double weight, String suborder, double strong, double speed) {
        setName(name);
        setType(type);
        setAge(age);
        setWeight(weight);
        this.suborder = suborder;
        this.strong = strong;
        this.speed = speed;

    }
    public void eat(Herbivorous herbivorous){};
    double force() {
        return (0.5 * weight) * (1.2 * strong) * (0.9 * speed);
    }
}


