package bai6.lythuyet.geomatric;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    private void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

//    public void setSide2(double side) {
//        super.setWidth(side);
//        super.setLength(side);
//    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
