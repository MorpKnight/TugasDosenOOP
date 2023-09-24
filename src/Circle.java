public class Circle {
    public double x, y;
    public double r;

    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double circumference(){
        return 2 * Math.PI * r;
    }

    public double area(){
        return Math.PI * r * r;
    }
}
