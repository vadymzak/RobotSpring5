package ua.javabegin.spring.impl.toshiba;

import org.springframework.stereotype.Component;
import ua.javabegin.spring.interfaces.Leg;


@Component
public class ToshibaLeg implements Leg {
    public void go() {
        System.out.println("Toshiba Leg");
    }
}
