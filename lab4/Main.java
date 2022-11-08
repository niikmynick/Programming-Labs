public class Main {
    public static void main(String[] args) throws RelationshipsException {
            try {
                    Skills quarrel = new Skills("Ссориться", "с другим коротышкой");
                    Skills fight = new Skills("Драться", "с другим коротышкой");
                    Skills discuss = new Skills("Обсуждать", "различные научные проблемы");
                    Skills dispute = new Skills("Спорить", null);
                    Skills doBetter = new Skills("Выполнять работу", "лучше, чем Знайка");
                    Skills doFaster = new Skills("Выполнять работу", "быстрее, чем Знайка");


                    Midget znaika = new Midget("Знайка");
                    znaika.addSkill(new Skills("Хотеть", "чтобы работа шла быстрее"));
                    znaika.addSkill(new Skills("Изнывать", "от нетерпения"));
                    znaika.addSkill(new Skills("Не интересоваться", "заниматься разработкой"));
                    znaika.addSkill(new Skills("Размышлять", "над явлением невесомости"));
                    znaika.addSkill(new Skills("Стараться", "найти  обоснование"));
                    znaika.addSkill(new Skills("Делиться", "с профессором Звезодчкиным"));
                    znaika.addSkill(new Skills("Дружить", "с профессором Звездочкиным"));;
                    znaika.addSkill(quarrel);
                    znaika.addSkill(fight);
                    znaika.addSkill(new Skills("Не расставаться", "с профессором Звездочкиным"));
                    znaika.addSkill(discuss);
                    znaika.addSkill(dispute);
                    znaika.addSkill(new Skills("Уважать", "профессора Звездочкина"));
                    System.out.println();

                    Midget zvezdochkin = new Midget("профессор Звездочкин");
                    zvezdochkin.addSkill(new Skills("Дружить", "со Знайкой"));
                    zvezdochkin.addSkill(quarrel);
                    zvezdochkin.addSkill(fight);
                    zvezdochkin.addSkill(new Skills("Не расставаться", "со Знайкой"));
                    zvezdochkin.addSkill(discuss);
                    zvezdochkin.addSkill(dispute);
                    zvezdochkin.addSkill(new Skills("Не терять", "уважение к Знайке"));
                    zvezdochkin.addSkill(new Skills("Говорить", "Истина рождается в спорах"));
                    System.out.println();

                    Midget.favouritePhrase phrase = new Midget.favouritePhrase() {
                            private String phrase;

                            public void setPhrase(String phrase, Midget person) {
                                    this.phrase = phrase;
                            }
                            public String getPhrase(Midget person) {
                                    return "Любимая фраза " + person + " это: \"" + this.phrase + "\"";
                            }
                    };
                    phrase.setPhrase("Истина рождается в спорах", zvezdochkin);
                    phrase.getPhrase(zvezdochkin);
                    System.out.println();

                    Midget designer1 = new Midget("Специалист-конструктор 1");
                    designer1.addSkill(quarrel);
                    designer1.addSkill(fight);
                    designer1.addSkill(doBetter);
                    designer1.addSkill(doFaster);
                    System.out.println();

                    Midget designer2 = new Midget("Специалист-конструктор 2");
                    designer2.addSkill(quarrel);
                    designer2.addSkill(fight);
                    designer2.addSkill(doBetter);
                    designer2.addSkill(doFaster);
                    System.out.println();

                    Midget midget1 = new Midget();
                    midget1.addSkill(quarrel);
                    midget1.addSkill(fight);
                    Midget midget2 = new Midget();
                    midget2.addSkill(quarrel);
                    midget2.addSkill(fight);
                    System.out.println();


                    Feeling feeling1 = new Feeling("Нетерпение");
                    Feeling feeling2 = new Feeling("Отсутствие интереса");
                    Feeling feeling3 = new Feeling("Лучше");
                    Feeling feeling4 = new Feeling("Быстрее");
                    Feeling feeling5 = new Feeling("Уважение");
                    System.out.println();

                    feeling1.setType(feelings.Impatience);
                    feeling2.setType(feelings.Uninterested);
                    feeling3.setType(feelings.Better);
                    feeling4.setType(feelings.Faster);
                    feeling5.setType(feelings.Respect);
                    System.out.println();


                    Midget.Actions.cry(znaika, feeling1);
                    Midget.Actions.want(znaika, feeling4);
                    Midget.Actions.notInterestIn(znaika, feeling2);
                    Midget.Actions.doWork(designer1, znaika, feeling3);
                    Midget.Actions.doWork(designer1, znaika, feeling4);
                    Midget.Actions.doWork(designer2, znaika, feeling3);
                    Midget.Actions.doWork(designer2, znaika, feeling4);
                    Midget.Actions.thinking(znaika);
                    Midget.Actions.struggle(znaika);
                    Midget.Actions.share(znaika, zvezdochkin);
                    Midget.Actions.befriend(znaika, zvezdochkin);
                    znaika.makeFriend(zvezdochkin);
//                    znaika.makeFriend(zvezdochkin);
//                    znaika.delEnemy(zvezdochkin);
                    Midget.Actions.quarrel(midget1, midget2);
                    Midget.Actions.fight(midget1, midget2);
                    Midget.Actions.befriend(midget1, midget2);
                    Midget.Actions.doNotSplit(znaika, zvezdochkin);
                    Midget.Actions.discuss(znaika, zvezdochkin);
                    Midget.Actions.argue(znaika, zvezdochkin);
                    znaika.makeEnemy(zvezdochkin);
                    Midget.Actions.respect(znaika, zvezdochkin, feeling5);
                    znaika.makeFriend(zvezdochkin);
                    Midget.Actions.loveToSay(zvezdochkin, phrase.getPhrase(zvezdochkin));
                    System.out.println();

//            Midget.relationships relationships = znaika.getRelationships();
//            System.out.println(relationships.getEnemy());
//            System.out.println(relationships.getFriend());

            } catch (RelationshipsException exception) {
                    System.out.println(exception);
//            } catch (TypeException exception) {
//                    System.out.println(exception);
            } catch (ProgramError error) {
                    System.out.println(error);
            }
    }
}
