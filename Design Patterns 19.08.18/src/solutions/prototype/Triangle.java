package solutions.prototype;

public class Triangle extends Shape implements Cloneable{

    @Override
    public String toString() {
        return "Triangle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    protected Triangle clone() {

        Triangle triangleClone = new Triangle();

        triangleClone.id = this.id;
        triangleClone.type = this.type;
        triangleClone.area = this.area;

        return triangleClone;

    }
}
