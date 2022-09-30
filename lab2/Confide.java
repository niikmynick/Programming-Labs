import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        def.addEffect(eff);
    }
    @Override
    protected String describe() {
        return "использовал секрет";
    }
}
