package de.test.demohaliltwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ShowClassExample {
    public int i;
    public String name;
    //public ShowAutowiredExample a3 = new ShowAutowiredExample();

    @Autowired
    public ShowClassExample(ShowAutowiredExample showAutowiredExample ) {
        System.out.println("Debug. I am the construktor" + showAutowiredExample.toStringtwo());
        this.name = showAutowiredExample.toStringtwo();
        this.name = showAutowiredExample.toStringtwo();
    }

    public void ShowMethod() {
        System.out.println("Debug: print from showclassexample " + name );
    }
}
