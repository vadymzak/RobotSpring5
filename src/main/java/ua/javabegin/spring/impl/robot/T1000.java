package ua.javabegin.spring.impl.robot;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.javabegin.spring.enums.ColorStyle;
import ua.javabegin.spring.interfaces.Hand;
import ua.javabegin.spring.interfaces.Head;
import ua.javabegin.spring.interfaces.Leg;

@Component
public class T1000 extends BaseModel{

    private ColorStyle color;

    private  int year;

    private boolean soundEnabled;

    public T1000(){}

    public T1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public T1000 model1() {
        return new T1000(ColorStyle.GOLD, 2015, true);
    }

    @Bean
    @Scope
    public T1000 model2() {
        return new T1000(ColorStyle.BLUE, 2010, false);
    }

    public T1000(Hand hand, Leg leg, Head head, ColorStyle color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }
    public T1000(ColorStyle color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ColorStyle getColor() {
        return color;
    }

    public void setColor(ColorStyle color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void fire() {
        super.fire();
        System.out.println("color - " + color);
        System.out.println("year - " + year);
        System.out.println("sound - " + soundEnabled);
    }
    @Override
    public void dance() {
        System.out.println("T1000 is dancing");
    }


}
