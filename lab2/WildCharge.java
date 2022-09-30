import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.NORMAL, 90, 100);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage / 4));
    }
    @Override
    protected String describe() {
        return "использовал буйный заряд";
    }
}
