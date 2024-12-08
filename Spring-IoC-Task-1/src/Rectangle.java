public class Rectangle implements Shape{

    @Override
    public void getArea() {

    }

    @Override
    public void getArea(double r) {
        double area = Math.pow(r,2);
        System.out.println("the area of the Square = " + area);
    }
}
