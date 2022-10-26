public abstract class abstractPlace implements placeDescription {
    public String name;
    public String typeName;

    @Override
    public int hashCode() {
        return super.hashCode() + this.getPlace().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return  object.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Место " + this.getPlace();
    }

    public String getPlace() {
        return name;
    }
}
