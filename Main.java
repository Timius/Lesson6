import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 26.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Predator tiger = new Predator("Шархан", "млекопитающие", 7.5, 200,
                "кошачьи", 71, 60);
       // поменял создание экземпляра класса через "объединенный" конструктор (намного удобнее)
        System.out.println(tiger.getName() + " cилой " + tiger.force());

        Herbivorous olen = new Herbivorous(3, 1.1, 75);
        olen.setWeight(100);
        System.out.println("Защита оленя " + olen.protection());
        olen.sType();

        Random random = new Random();
        int k = random.nextInt(11);//коэффициент для вариации метода
        tiger.eat(olen);//метод Eat (олень чаще убегает, так и задумывалось и соответствует реалиям...)
        {
            if (tiger.force()>k*olen.protection())
                System.out.println("Тигр съел оленя");
            else System.out.println("Олень убежал");
                  };

        Felidae felidae = new Felidae();
        felidae.setName("puma");

        Skill[] pumaSkills = new Skill[3];
        pumaSkills[0] = new Skill("прячет когти", true);
        pumaSkills[1] = new Skill("охотится путём подкрадывания", true);
        pumaSkills[2] = new Skill("одиночная", true);
        felidae.setSkills(pumaSkills);

        System.out.println(felidae.getName());
        System.out.println(felidae.hasSkill("прячет когти"));
        }
}
