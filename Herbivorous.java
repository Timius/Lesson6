/**
 * Created by User on 26.10.2016.
 */
public class Herbivorous {
    //имя, тип, возраст, вес унаследую от класса животные
    int hoof;
    double growth;
    Herbivorous(int h, double g){   //конструктор не через this для практики
       hoof=h;
       growth=g;
}
    void running(){
        System.out.println("Убегает от хищников");
    }
    void eat(){
        System.out.println("Ест траву");
    }
    void sType(){
        if (hoof == 2) System.out.println("парнокопытные");
        else System.out.println("не парнокопытные");
    }

}

