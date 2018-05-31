package ua.javabegin.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.javabegin.spring.impl.robot.T1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

        //Object obj = (T1000) context.getBean("t1000");

            T1000 t1000 = (T1000) context.getBean("t1000");
            t1000.fire();

    }
}
