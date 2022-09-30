import ru.ifmo.se.pokemon.*;

public class lab2 {
    public static void main(String[] args) {

        Battle b = new Battle();

        Carnivine p1 = new Carnivine("Карнивин", 1);
        Espeon p2 = new Espeon("Эспеон", 1);
        Pikachu p3 = new Pikachu("Пикачу", 1);
        Eevee p4 = new Eevee("Иви", 1);
        Pichu p5 = new Pichu("Пичу", 1);
        Raichu p6 = new Raichu("Райчу", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();

    }
}
