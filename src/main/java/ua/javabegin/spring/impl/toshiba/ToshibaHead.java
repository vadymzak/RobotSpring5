package ua.javabegin.spring.impl.toshiba;

import org.springframework.stereotype.Component;
import ua.javabegin.spring.interfaces.Head;

@Component
public class ToshibaHead implements Head {
    public void thinking() {
        System.out.println("Toshiba head");
    }
}
