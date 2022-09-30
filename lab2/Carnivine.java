import ru.ifmo.se.pokemon.*;

public class Carnivine extends Pokemon {
    public Carnivine(String name, int level) {
        super(name, level);
        setStats(74, 100, 72, 90, 72, 46);
        setType(Type.GRASS);
        setMove(new VineWhip(), new Swagger(), new Growth(), new Slam());
    }
}
