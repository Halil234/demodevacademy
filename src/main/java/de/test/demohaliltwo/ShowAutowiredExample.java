package de.test.demohaliltwo;

import org.springframework.stereotype.Component;

@Component
public class ShowAutowiredExample {
    public int i ;

    public ShowAutowiredExample() {
        System.out.println("Debug: This is the ShowAutowireExample constructor ");
        this.i = 4;
    }


    public String toStringtwo() {
        return "ShowAutowiredExample{" +
                "i=" + i +
                '}';
    }
}
