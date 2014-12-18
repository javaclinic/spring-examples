package example.services;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyService {

    private static final Logger LOGGER = Logger.getLogger(MyService.class.getCanonicalName());

    private String name;
    private int count;
    private List<String> aliases;
    private boolean active;

    @Autowired
    @Qualifier("special-component")
    private MyComponent component;

    static {
        LOGGER.info("Inside static initializer for MyService class.");
    }

    // constructor
    public MyService() {
        LOGGER.info("Inside constructor MyService().");
    }

    // business method
    public String info() {
        LOGGER.info("Inside info() method.");
        return String.format("{name=%s,count=%s,aliases=%s,active=%s,component=%s}",this.name,this.count,this.aliases,this.active,this.component);
    }

    // accessors and mutators
    public String getName() {
        LOGGER.info("Inside getName() method.");
        return name;
    }
    public void setName(String name) {
        LOGGER.info("Inside setName() method.");
        this.name = name;
    }
    public int getCount() {
        LOGGER.info("Inside getCount() method.");
        return count;
    }
    public void setCount(int count) {
        LOGGER.info("Inside setCount() method.");
        this.count = count;
    }
    public List<String> getAliases() {
        LOGGER.info("Inside getAliases() method.");
        return aliases;
    }
    public void setAliases(List<String> aliases) {
        LOGGER.info("Inside setAliases() method.");
        this.aliases = aliases;
    }
    public boolean isActive() {
        LOGGER.info("Inside isActive() method.");
        return active;
    }
    public void setActive(boolean active) {
        LOGGER.info("Inside setActive() method.");
        this.active = active;
    }
    public MyComponent getComponent() {
        LOGGER.info("Inside getComponent() method.");
        return component;
    }

    public void setComponent(MyComponent component) {
        LOGGER.info("Inside setComponent() method.");
        this.component = component;
    }

    @PostConstruct
    public void initialize() {
        LOGGER.info("Inside initialize() method.");
     }

    @PreDestroy
    public void destroy() {
        LOGGER.info("Inside destroy() method.");
    }

}
