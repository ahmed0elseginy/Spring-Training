public class Circle implements Shape{
    @Override
    public void getArea() {
    }
    @Override
    public void getArea(double r) {
        double area = Math.PI * Math.pow(r,2);
        System.out.println("he area of the circle = "+ area);
    }

}
