import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect eff = new Effect().stat(Stat.DEFENSE, -1);
        opp.addEffect(eff);
    }
    @Override
    protected String describe() {
        return "виляет хвостом";
    }
}
