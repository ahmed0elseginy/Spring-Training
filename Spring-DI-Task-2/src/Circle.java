public class Circle implements Shape {

    private final Draw2d draw2d;
    private final Draw3d draw3d;

    public Circle(Draw2d draw2d, Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    @Override
    public void draw2d() {
        draw2d.draw2d("Circle");
    }

    @Override
    public void draw3d() {
        draw3d.draw3d("Circle");
    }
}
