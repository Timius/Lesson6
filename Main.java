import Komposition.Felidae;
import Komposition.Skill;

import java.util.Random;

/**
 * Created by User on 26.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println(tiger.getName() + " cилой " + tiger.force());
        Lion lion1 = new Lion("Лев", "Млекопитающее", 8.0, 190, "кошачьи",65, 60,
                "Глава прайда");
        System.out.println("Мощь льва " + lion1.force());

        Tiger tiger1 = new Tiger("Тигр", "млекопитающие", 7.5, 200,
                "кошачьи", 71, 80, "Амурский");
        System.out.println("Мощь тигра " + tiger1.force());

        Volf volf1 = new Volf("Волк", "Млекопитающее", 6, 50, "Псовые", 50, 50,
                "Охотится стаей");
        System.out.println("Мощь волка " + volf1.force());

        Olen olen1 = new Olen("Олень", "Млекопитающее", 3, 160, 1.1, 70, "Северный");
        System.out.println("Защита оленя " + olen1.protection());

        Slon slon1 = new Slon("Слон", "Млекопитающее", 10, 5500, 3.3, 45, 1);
        System.out.println("Защита слона " + slon1.protection());

        Hare hare1 = new Hare("Заец", "Млекопитающее", 10, 5.0, 0.3, 55, "белый");
        System.out.println("Защита зайца " + hare1.protection());

        Monkey monkey1 = new Monkey("Обезьяна", "Млекопитающее", 15, 200, 1.7, 40,
                "Лазит по деревьям", "Горилла");
        System.out.println("Защита обезьяны " + monkey1.protection());

        Random random = new Random();
        //int k = random.nextInt(10);//коэффициент для вариации метода

        tiger1.eat(olen1);//метод Eat (олень чаще убегает, так и задумывалось и соответствует реалиям...)
        {
            int k = random.nextInt(10);
            if (tiger1.force()>k*olen1.protection())
                System.out.println(tiger1.getName() + " съел " + olen1.getName()+k);
            else System.out.println(olen1.getName() + " убежал от " + tiger1.getName());
                  };

        tiger1.eat(slon1);
        {
            int k = random.nextInt(10);
            if (tiger1.force()>k*slon1.protection())
                System.out.println(tiger1.getName() + " съел " + slon1.getName());
            else System.out.println(slon1.getName() + " убежал от " + tiger1.getName());
        };

        tiger1.eat(hare1);
        {
            int k = random.nextInt(10);
            if (tiger1.force()>k*hare1.protection())
                System.out.println(tiger1.getName() + " съел " + hare1.getName());
            else System.out.println(hare1.getName() + " убежал от " + tiger1.getName());
        };

        volf1.eat(olen1);
        {
            int k = random.nextInt(10);
            if (8*volf1.force()>k*olen1.protection()) //ввел коефициент на охоту стаей
                System.out.println(volf1.getName() + " съел " + olen1.getName());
            else System.out.println(olen1.getName() + " убежал от " + volf1.getName());
        };

        volf1.eat(hare1);
        {
            int k = random.nextInt(10);
            if (8*volf1.force()>k*hare1.protection()) //ввел коефициент на охоту стаей
                System.out.println(volf1.getName() + " съел " + hare1.getName());
            else System.out.println(hare1.getName() + " убежал от "+volf1.getName());
        };

        volf1.eat(slon1);
        {
            int k = random.nextInt(10);
            if (8*volf1.force()>k*slon1.protection()) //ввел коефициент на охоту стаей
                System.out.println(volf1.getName() + " съел " + slon1.getName());
            else System.out.println(slon1.getName() + " убежал от " + volf1.getName());
        };

        lion1.eat(olen1);
        {
            int k = random.nextInt(10);
            if (lion1.force()>k*olen1.protection())
                System.out.println(lion1.getName() + " съел " + olen1.getName());
            else System.out.println(olen1.getName() + " убежал от " + lion1.getName());
        };

        lion1.eat(hare1);
        {
            int k = random.nextInt(10);
            if (lion1.force()>k*hare1.protection())
                System.out.println(volf1.getName() + " съел " + hare1.getName());
            else System.out.println(hare1.getName() + " убежал от " + lion1.getName());
        };

        lion1.eat(slon1);
        {
            int k = random.nextInt(10);
            if (lion1.force()>k*slon1.protection())
                System.out.println(lion1.getName() + " съел " + slon1.getName());
            else System.out.println(slon1.getName() + " убежал от " + lion1.getName());
        };

        lion1.eat(monkey1);
        {
            int k = random.nextInt(10);
            if (lion1.force()>k*monkey1.protection())
                System.out.println(lion1.getName() + " съел " + monkey1.getName());
            else System.out.println(monkey1.getName() + " убежал от " + lion1.getName());
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
