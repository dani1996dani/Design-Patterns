package solutions.prototype;

public class Oval extends Shape implements Cloneable {

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    protected Oval clone() {

        Oval ovalClone = new Oval();

        ovalClone.id = this.id;
        ovalClone.type = this.type;
        ovalClone.area = this.area;

        return ovalClone;

    }
}
