import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        Effect eff = new Effect().stat(Stat.SPECIAL_ATTACK, +1).stat(Stat.SPECIAL_DEFENSE, +1);
        att.addEffect(eff);
    }
    @Override
    protected String describe() {
        return "очистил разум";
    }
}
