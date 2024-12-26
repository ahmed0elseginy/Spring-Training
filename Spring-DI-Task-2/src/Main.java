import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Define the container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        // FileSystemXmlApplicationContext("pathFile")

        Shape circle = container.getBean("circleShape",Circle.class);
        Shape square = container.getBean("squareShape",Square.class);

        circle.draw2d();
        circle.draw3d();

        square.draw2d();
        square.draw3d();
    }
}