import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Define the container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
                                    // FileSystemXmlApplicationContext("pathFile")
        Scanner sc = new Scanner(System.in);
        //retrieving the bean
        Shape circle = container.getBean("circle",Shape.class);
        int r = sc.nextInt();
        circle.getArea(r);
        Shape rectangle = container.getBean("rectangle",Shape.class);
        rectangle.getArea(r);
    }
}