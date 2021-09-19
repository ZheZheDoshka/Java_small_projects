package ua.kpi.tef;

public class Triangle extends Shape{
    private Point point_A;
    private Point point_B;
    private Point point_C;

    private double side(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(),2) +
                Math.pow(a.getY() - b.getY(),2));
    }

    public Triangle(Point a, Point b, Point c)
            throws IllegalArgumentException {
        checkTriangle(a,b,c);
    }

    private void checkTriangle(Point a, Point b, Point c) throws IllegalArgumentException {
        double[] sides = {side(a,b), side(b,c), side(c,a)};
        if(sides[0] + sides[1] <= sides[2]){
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        if(sides[1] + sides[2] <= sides[0]){
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        if(sides[2] + sides[0] <= sides[1]){
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        setPoint_A(a);
        setPoint_B(b);
        setPoint_C(c);
    }

    @Override
    public double perimeter(){
        return (side(point_A, point_B) + side(point_B, point_C) + side(point_C, point_A));
    }

    @Override
    public double square() {
        double half_perimeter = this.perimeter()/2;
        return Math.sqrt(half_perimeter*(half_perimeter - side(point_A, point_B))
                *(half_perimeter - side(point_B, point_C))
                *(half_perimeter -side(point_A, point_B)));
    }

    @Override
    public void move(double dx, double dy) {
        point_A.setX( point_A.getX() + dx);
        point_A.setY( point_A.getY() + dy);
        point_B.setX( point_B.getX() + dx);
        point_B.setY( point_B.getY() + dy);
        point_C.setX( point_C.getX() + dx);
        point_C.setY( point_C.getY() + dy);

    }

    @Override
    public String toString() {
        return "Side 1 = " + getPoint_A() +", Side 2 = " + getPoint_B() + ", Side 3 = " + getPoint_C() ;
    }

    public void setPoint_A(Point point_A) {
        this.point_A = point_A;
    }

    public void setPoint_B(Point point_B) {
        this.point_B = point_B;
    }

    public void setPoint_C(Point point_C) {
        this.point_C = point_C;
    }

    public Point getPoint_A() {
        return point_A;
    }

    public Point getPoint_B() {
        return point_B;
    }

    public Point getPoint_C() {
        return point_C;
    }
}
