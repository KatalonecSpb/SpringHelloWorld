import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean4 = (Cat) applicationContext.getBean("cat");

        System.out.println("Первая пара - " + (bean1 == bean2));
        System.out.println("Вторая пара - " + (bean3 == bean4));
    }
}