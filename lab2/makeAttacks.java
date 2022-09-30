package lab2;

import ru.ifmo.se.pokemon.*;

public class makeAttacks {

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
        protected java.lang.String describe() {
            return "повысил атаку";
        }
    }

    public class Slam extends PhysicalMove {
        public Slam() {
            super(Type.NORMAL, 80, 75);
        }
        @Override
        protected String describe() {
            return "наскочил";
        }
    }

    public class Swagger extends StatusMove {
        public Swagger() {
            super(Type.NORMAL, 0, 85);
        }
        @Override
        protected void applyOppEffects(Pokemon opp) {
            opp.confuse();
            opp.setMod(Stat.ATTACK, 2);
        }
        @Override
        protected java.lang.String describe() {
            return "сбивает с толку и увеличивает атаку";
        }
    }

    public class Tackle extends PhysicalMove {
        public Tackle() {
            super(Type.NORMAL, 40, 100);
        }
        @Override
        protected String describe() {
            return "толкнул";
        }
    }

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
        protected java.lang.String describe() {
            return "виляет хвостом";
        }
    }

    public class VineWhip extends PhysicalMove {
        public VineWhip() {
            super(Type.GRASS, 45, 100);
        }
        @Override
        protected String describe() {
            return "ударил лозой";
        }
    }

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
}
