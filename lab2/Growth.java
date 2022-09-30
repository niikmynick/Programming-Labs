import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        Effect eff = new Effect().stat(Stat.ATTACK, +1).stat(Stat.SPECIAL_ATTACK, +1);
        att.addEffect(eff);
    }
    @Override
    protected String describe() {
        return "повысил атаку";
    }
}
