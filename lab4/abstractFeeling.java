public abstract class abstractFeeling implements feelingInterface{
    public String feelingName;
    public String typeName;


    @Override
    public int hashCode() {
        return super.hashCode()+this.getFeeling().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return this.getFeeling();
    }

    public String getFeeling() {
        return feelingName;
    }

    public void setType(feelings feeling) {
    }

    public String getType() {
        return typeName;
    }
}
