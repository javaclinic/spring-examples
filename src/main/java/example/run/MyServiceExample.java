package example.run;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.services.MyService;

/**
 * This runnable example demonstrates Spring BeanFactory, a factory that instantiates, configures and wires objects.
 * 
 * @author nevenc
 *
 */
public class MyServiceExample {

    public static void main(String[] args) {

        ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService service = factory.getBean(MyService.class);
        System.out.println("Service:" + service.info());
        factory.close();

    }

}
