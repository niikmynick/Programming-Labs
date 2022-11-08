import java.util.ArrayList;
import java.util.List;

public class Midget extends abstractHuman {
    private final List<Skills> skills = new ArrayList<Skills>();

    private Midget friend, enemy;

    public Midget() {
        System.out.println("Лилипут создан с именем " + name);
    }

    public Midget(String name) {
        this.name = name;
        System.out.println("Лилипут " + name + " создан");
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public boolean addSkill(Skills skill) {
        if (skills.add(skill)) {
            System.out.println("Лилипут " + this.getName() + " теперь умеет " + skill.getName() + " (" + skill.getInfo() + ")");
            return true;
        } else {
            System.out.println("Ошибка при добавлении навыка");
            return false;
        }
    }

    public static class Actions {

        public static void say(Midget person, String phrase) {
            if (phrase == null) {
                System.out.println(person + " сказал");
            } else {
                System.out.println(person + " сказал \"" + phrase + "\"");
            }
        }

        public static void decideToGo(Midget person, Place place) {
            System.out.println(person + " решил отправиться в " + place);
        }

        public static void dissuade(Midget person1, Midget person2) {
            System.out.println(person1 + " отговаривали " + person2);
        }

        public static void beConfident(Midget person) {
            System.out.println(person + " стоял на своем");
        }

        public static void feedSmbd(Midget person1, Midget person2) {
            System.out.println(person1 + " покормил(и) " + person2);
        }

        public static void broughtSmbdTo(Place place) {
            System.out.println("вывели на " + place);
        }

        public static void show(Place place) {
            System.out.println("показали дорогу в" + place);
        }

        public static void think(Midget person) {
            System.out.println(person + " считали");
        }

        public static void go(Midget person, Place place) {
            System.out.println(person + " идет в " + place);
        }

        public static void goodbyes(Midget person) {
            System.out.println("прощались с " + person);
        }

        public static void cry(Midget person, Feeling feeling) {
            System.out.println(person + " изнывал от " + feeling);
        }

        public static void want(Midget person, Feeling feeling) {
            System.out.println(person + " хотел, чтобы работа шла " + feeling);
        }

        public static void notInterestIn(Midget person, Feeling feeling) {
            System.out.println(person + " чувствовал " + feeling + " к разработке отдельных узлов");
        }

        public static void doWork(Midget person, Midget person2, Feeling feeling) {
            System.out.println(person + " мог выполнить работу " + feeling + ", чем " + person2);
        }

        public static void thinking(Midget person) {
            System.out.println(person + " размышлял над явлением невесомости");
        }

        public static void struggle(Midget person) {
            System.out.println(person + " старался найти обоснование");
        }

        public static void share(Midget person1, Midget person2) {
            System.out.println(person1 + " делился с " + person2);
        }

        public static void befriend(Midget person, Midget person2) {
            System.out.println(person + " подружил с " + person2);
        }

        public static void quarrel(Midget person, Midget person2) {
            System.out.println(person + " поссорился с " + person2);
        }

        public static void fight(Midget person, Midget person2) {
            System.out.println(person + " подрался с " + person2);
        }

        public static void doNotSplit(Midget person, Midget person2) {
            System.out.println(person + " не расставался с " + person2);
        }

        public static void discuss(Midget person, Midget person2) {
            System.out.println(person + " обсуждал различные научные проблемы с " + person2);
        }

        public static void argue(Midget person, Midget person2) {
            System.out.println(person + " спорил с " + person2);
        }

        public static void respect(Midget person, Midget person2, Feeling feeling) {
            System.out.println(person + " не терял " + feeling + " к " + person2);
        }

        public static void loveToSay(Midget person, String phrase) {
            System.out.println(person + " любил говорить " + phrase);
        }
    }

    public void makeFriend(Midget friend) throws RelationshipsException{
        if (this.friend == friend) {
            throw new RelationshipsException(this.getName() + " уже дружит с " + friend);
        } else {
            this.friend = friend;
            System.out.println(this.getName() + " подружился с " + friend);

            if (friend == this.enemy) {
                this.enemy = null;
            }
        }
    }

    public void makeEnemy(Midget enemy) throws RelationshipsException{
        if (enemy == this.enemy) {
            throw new RelationshipsException(this.getName() + " уже в ссоре с " + friend);
        } else {
            this.enemy = enemy;
            System.out.println(this.getName() + " поссорился с " + enemy);

            if (enemy == this.friend) {
                this.friend = null;
            }
        }
    }

    public void delFriend(Midget friend) throws TypeException{
        if (this.friend == friend) {
            this.friend = null;
            System.out.println(this.getName() + " больше не дружит с " + friend);
        } else {
            throw new TypeException("Нельзя удалить " + friend + " из друзей " + this.getName() + ", так как он не является его другом");
        }
    }

    public void delEnemy(Midget enemy) throws TypeException{
        if (this.enemy == enemy) {
            this.enemy = null;
            System.out.println(this.getName() + " больше не обижается на " + enemy);
        } else {
            throw new TypeException("Нельзя удалить " + enemy + " из списка ссор " + this.getName() + ", так как они не ссорились");
        }

    }

    public interface relationships {
        String getFriend();
        String getEnemy();
    }

    public relationships getRelationships() {
        class MidgetRelationships implements relationships {
            final Midget friend = Midget.this.friend;
            final Midget enemy = Midget.this.enemy;

            @Override
            public String getFriend() {
                if (this.friend == null) {
                    return Midget.this.getName() + " ни с кем не дружит";
                } else {
                    return Midget.this.getName() + " дружит с " + this.friend;
                }
            }

            @Override
            public String getEnemy() {
                if (this.enemy == null) {
                    return Midget.this.toString() + " ни с кем не в ссоре";
                } else {
                    return Midget.this.toString() + " в ссоре с " + this.enemy;
                }
            }
        }

        return new MidgetRelationships();
    }

    public interface favouritePhrase {
        void setPhrase(String phrase, Midget person);
        String getPhrase(Midget person);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Лилипут " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }

}