package example.services;

import java.util.logging.Logger;

public class MyComponent {

    private static final Logger LOGGER = Logger.getLogger(MyComponent.class.getCanonicalName());

    static {
        LOGGER.info("Inside static initializer for MyComponent.");
    }

    public MyComponent() {
        LOGGER.info("Inside MyComponent() default constructor.");
    }

}
