package example.services;

import java.util.logging.Logger;

public class MyComponent {

    private static final Logger LOGGER = Logger.getLogger(MyComponent.class.getCanonicalName());
    static {
        LOGGER.info("Inside static initializer for MyComponent.");
    }

    private String name;

    public MyComponent(String name) {
        LOGGER.info("Inside MyComponent() default constructor.");
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyComponent [name=" + name + "]";
    }

    
}
