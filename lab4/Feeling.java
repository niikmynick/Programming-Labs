public class Feeling extends abstractFeeling{
    private final String feelingName;

    public Feeling(String name){
        this.feelingName = name;
        System.out.println("Характеристика - \"" + name  + "\" успешно создана!");
    }

    public void setType(feelings type){
        typeName = "";
        switch (type) {
            case Better -> typeName = "Лучше";
            case Faster -> typeName = "Быстрее";
            case Respect -> typeName = "Уважение";
            case Impatience -> typeName = "Нетерпение";
            case Uninterested -> typeName = "Неинтересовался";
        }
        System.out.println(feelingName +" обозначает " + typeName);
    }

    public String getType() {
        return this.typeName;
    }

    public String getFeeling() {
        return feelingName == null ? "..." : feelingName;
    }
}
