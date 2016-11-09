/**
 * Created by User on 26.10.2016.
 */
public class Herbivorous extends Animal {
    //имя, тип, возраст, вес унаследовал от класса животные (скорость правильнее перенести в Энимал)
    private double growth; //высота
    private double speed;
    protected Herbivorous(String name, String type, double age,
                double weight, double g, double s){   //конструктор не через this для практики
        growth=g;
        speed=s;
        setName(name);
        setType(type);
        setAge(age);
        setWeight(weight);
}

    void running(){
        System.out.println("Убегает от хищников");
    }
 //   void eat(){
 //       System.out.println("Ест траву");
 //   }

    public double protection(){ return (1.5*weight)*(2.0*speed)*10;  }//10 эмпирический коэфициент для правдоподобности
}

