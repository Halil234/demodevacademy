package de.test.demohaliltwo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class DemohaliltwoApplicationTests {

    @MockBean
    public ShowAutowiredExample showAutowiredExample;

    @Autowired
    public ShowClassExample showClassExample;

    @Test
    public void showthatitworks() {
        showClassExample.ShowMethod();
    }

    @Test
    public void secondtest() {
        showClassExample.ShowMethod();
        //Mockito.verify(roleRepository, Mockito.times(1)).getRole(Mockito.anyString());
        Mockito.verify(showAutowiredExample, Mockito.times(3)).toStringtwo();
    }

}
