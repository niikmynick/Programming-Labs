public class Main {
    public static void main(String[] args) {
        Midget Smekailo = new Midget("Смекайло");
        Smekailo.addSkill(new Skills("Говорить", null));
        Smekailo.addSkill(new Skills("Прощаться", "со слезами на глазах"));
        System.out.println();

        Midget Znaika = new Midget("Знайка");
        Znaika.addSkill(new Skills("Стоять на своем", null));
        System.out.println();

        Midget Malish1 = new Midget();
        Malish1.addSkill(new Skills("Кормить", "его"));
        Malish1.addSkill(new Skills("Прощаться", "со слезами на глазах"));
        System.out.println();

        Midget Malish2 = new Midget();
        Malish2.addSkill(new Skills("Кормить", "его"));
        Malish2.addSkill(new Skills("Прощаться", "со слезами на глазах"));
        System.out.println();

        Midget Malish3 = new Midget();
        Malish3.addSkill(new Skills("Кормить", "его"));
        Malish3.addSkill(new Skills("Прощаться", "со слезами на глазах"));
        System.out.println();

        Place GreenCity = new Place("Зеленый город");
        GreenCity.setType(Places.City);
        Znaika.addSkill(new Skills("Твердо решить", "отправиться в " + GreenCity.getPlace()));
        Malish1.addSkill(new Skills("Показать", "дорогу в " + GreenCity.getPlace()));
        Malish2.addSkill(new Skills("Показать", "дорогу в " + GreenCity.getPlace()));
        Malish3.addSkill(new Skills("Показать", "дорогу в " + GreenCity.getPlace()));
        System.out.println();

        Place CountrySide = new Place("Окраина города");
        CountrySide.setType(Places.Outside);
        Malish1.addSkill(new Skills("Отводить", "на " + CountrySide.getPlace()));
        Malish2.addSkill(new Skills("Отводить", "на " + CountrySide.getPlace()));
        Malish3.addSkill(new Skills("Отводить", "на " + CountrySide.getPlace()));
        System.out.println();

        Place Death = new Place("Верная гибель");
        Death.setType(Places.Abstract);
        Znaika.addSkill(new Skills("Идти", "на " + Death.getPlace()));
        Smekailo.addSkill(new Skills("Считать", "что Знайка идет на " + Death.getPlace()));
        Malish1.addSkill(new Skills("Считать", "что Знайка идет на " + Death.getPlace()));
        Malish2.addSkill(new Skills("Считать", "что Знайка идет на " + Death.getPlace()));
        Malish3.addSkill(new Skills("Считать", "что Знайка идет на " + Death.getPlace()));
        System.out.println();

        Midget.say(Smekailo.getName());
        Midget.decideToGo(Znaika.getName(), GreenCity.getPlace());
        Midget.dissuade("Жители", Znaika.getName());
        Midget.beConfident(Znaika.getName());
        Midget.feedSmbd("Малыши", Znaika.getName());
        Midget.broughtSmbdTo(CountrySide.getPlace());
        Midget.show("Дорога в " + GreenCity.getPlace());
        Midget.think("Все");
        Midget.goToDeath("Он");
        Midget.goodbyes("Ним");

    }
}