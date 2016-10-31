import java.util.Random;

/**
 * Created by User on 26.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Predator tiger = new Predator("кошачьи", 71, 60);
        tiger.setName("Шархан");
        tiger.setAge(7.5);
        tiger.setType("Хищник");
        tiger.setWeight(200);


        System.out.println(tiger.getName());
        tiger.eat();
        tiger.force();
        System.out.println("Сила тигра " + tiger.force());

        Herbivorous olen = new Herbivorous(3, 1.1, 75);
        System.out.println("olen");
        olen.setWeight(100);
        olen.eat();
        olen.running();
        olen.sType();
        System.out.println("Защита оленя " + olen.protection());

        Random random = new Random();
        int k = random.nextInt(11);//коэффициент для вариации следующей "охоты"
        //System.out.println("k="+k);
  if (tiger.force()>k*olen.protection())//кто победит хищник или травоядное (олень чаще убегает, так и задумывалось и соответствует реалиям...)
      System.out.println("Тигр съел оленя");
  else System.out.println("Олень убежал");

    }
}
