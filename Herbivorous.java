/**
 * Created by User on 26.10.2016.
 */
public class Herbivorous extends Animal {
    //имя, тип, возраст, вес унаследовал от класса животные (скорость правильнее перенести в Энимал)
    int hoof;
    double growth; //высота
    double speed;
    Herbivorous(int h, double g, double s){   //конструктор не через this для практики
       hoof=h;
       growth=g;
       speed=s;
}
    void running(){
        System.out.println("Убегает от хищников");
    }
    void eat(){
        System.out.println("Ест траву");
    }
    void sType(){
        if (hoof == 2) System.out.println("Парнокопытные");
        else System.out.println("Не парнокопытные");
    }
    double protection(){ return (1.5*weight)*(2.0*speed)*10;  }//10 эмпирический коэфициент для правдоподобности
}

