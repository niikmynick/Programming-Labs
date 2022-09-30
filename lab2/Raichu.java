import ru.ifmo.se.pokemon.*;

public class Raichu extends Pokemon {
    public Raichu(String name, int level) {
        super(name, level);
        setStats(60, 90, 55, 90, 80, 110);
        setType(Type.ELECTRIC);
        setMove(new TailWhip(), new WildCharge(), new Growl());
    }
}
