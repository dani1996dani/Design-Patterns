package solutions.prototype;

public class Square extends Shape implements Cloneable {

    @Override
    public String toString() {
        return "Square{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    protected Square clone() {

        Square squareClone = new Square();

        squareClone.id = this.id;
        squareClone.type = this.type;
        squareClone.area = this.area;

        return squareClone;

    }
}
