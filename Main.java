/**
 * Created by User on 26.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Predator tiger = new Predator("Кошачьи", 34, 15);
        System.out.println("tiger");
        tiger.eat();
        tiger.force();
        System.out.println("Сила " + tiger.force());

        Herbivorous olen = new Herbivorous(2, 4.5);
        System.out.println("olen");
        olen.eat();
        olen.running();
        olen.sType();
    }
}
