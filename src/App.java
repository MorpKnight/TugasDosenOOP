public class App {
    public static void main(String[] args) {
        Circle aCircle = new Circle(10, 20, 5);

        double area = aCircle.area();
        double circumf = aCircle.circumference();
        System.out.println("Radius=" + aCircle.r + " Area=" + area);
        System.out.println("Radius=" + aCircle.r + " Circumference=" + circumf);
    }
}
