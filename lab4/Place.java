import java.util.ArrayList;
import java.util.List;

public class Place extends abstractPlace {
    private final List<Skills> skills = new ArrayList<Skills>();

    private Places type;

    public Place(String name) {
        this.name = name;
        System.out.println("Место " + name + " создано");
    }

    public void setType(Places type) {
        this.type = type;
        switch (type) {
            case City -> typeName = "Город";
            case Outside -> typeName = "Окраина города";
            case Abstract -> typeName = "Направление, но не реальное";
        }
        System.out.println("Место с именем " + name + " обозначает " + typeName);
    }

    public Places getType() {
        return this.type;
    }

    public String getPlace() {
        if (name == null) {
            return "...";
        }
        else {
            return name;
        }
    }

    public List<Skills> getSkills() {
        return skills;
    }
}