/**
 * Created by User on 26.10.2016.
 */
public class Predator extends Animal {
    //имя, тип, возраст, вес унаследовал от класса животные
    private String suborder;   //подотряд псовые или кошачьи
    double strong;
    double speed;
    Predator (String suborder, double strong, double speed) {
        this.suborder=suborder;
        this.strong = strong;
        this.speed = speed;
    }


    void eat(){
        System.out.println("Ест травоядных");
    }
    double force(){ return (0.5*weight)*(1.2*strong)*(0.9*speed);  }
}

