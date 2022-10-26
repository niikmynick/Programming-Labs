import java.util.ArrayList;
import java.util.List;

public class Midget extends abstractHuman {
    private final List<Skills> skills = new ArrayList<Skills>();

    public Midget() {
        System.out.println("Неизвестный лилипут создан с именем  " + name);
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
        }
        else {
            System.out.println("Ошибка при добавлении навыка");
            return false;
        }
    }

    public static void say(String person) {
        System.out.println(person + " сказал");
    }

    public static void decideToGo(String person, String place) {
        System.out.println(person + " решил отправиться в " + place);
    }

    public static void dissuade(String person1, String person2) {
        System.out.println(person1 + " отговаривали его " + person2);
    }

    public static void beConfident(String person) {
        System.out.println(person + " стоял на своем");
    }

    public static void feedSmbd(String person1, String person2) {
        System.out.println(person1 + " покормил " + person2);
    }

    public static void broughtSmbdTo(String place) {
        System.out.println("вывели на " + place);
    }

    public static void show(String place) {
        System.out.println("показали " + place);
    }

    public static void think(String person) {
        System.out.println(person + " считали");
    }

    public static void goToDeath(String person) {
        System.out.println(person + " идет на верную гибель");
    }

    public static void goodbyes(String person) {
        System.out.println("прощались с " + person);
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Человек по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }
}
