import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        def.addEffect(eff);
    }
    @Override
    protected String describe() {
        return "использовал рычание";
    }
}
