public abstract class abstractHuman implements humanDescription{
    public String name;


    public abstractHuman(String name) {
        this.name = name;
    }
    public abstractHuman() {
        this.name = "Малышарик";
    }
    public String getName() {
        return name;
    }
}
