package de.test.demohaliltwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemohaliltwoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemohaliltwoApplication.class, args);

        System.out.println("Debug: Hello Main");

        ShowClassExample a =  context.getBean(ShowClassExample.class);
        ShowClassExample a2 = context.getBean(ShowClassExample.class);

        a.ShowMethod();
        a2.ShowMethod();
    }

}
