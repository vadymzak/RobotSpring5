package ua.javabegin.spring.impl.toshiba;

import org.springframework.stereotype.Component;
import ua.javabegin.spring.interfaces.Hand;

@Component
public class ToshibaHand implements Hand {
    public void catchSomething() {
        System.out.println("Toshiba hand");
    }
}
