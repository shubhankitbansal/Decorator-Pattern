import baseClass.BasePizza;
import childClass.Margarita;
import decorators.ExtraCheese;
import decorators.Jalapeno;
import decorators.Mushroom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BasePizza margarita = new Margarita();
        System.out.println("margarita cost " + margarita.getCost());

        System.out.println("Add Extracheese to margarita");
        margarita = new ExtraCheese(margarita);
        System.out.println(margarita.getCost());

        System.out.println("Add Mushroom and Jalapeno to margarita");
        margarita = new Jalapeno(new Mushroom(margarita));
        System.out.println(margarita.getCost());

        System.out.println("Add 2 unit of mushroom to margarita");
        margarita = new Mushroom(new Mushroom(margarita));
        System.out.println(margarita.getCost());

    }
}