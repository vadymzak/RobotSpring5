package ua.javabegin.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.javabegin.spring.impl.conveyor.T1000Conveyor;
import ua.javabegin.spring.impl.robot.T1000;
import ua.javabegin.spring.interfaces.Robot;
import ua.javabegin.spring.interfaces.RobotConveyor;
import ua.javabegin.spring.pool.T1000Pool;
import ua.javabegin.spring.pool.T1000PoolMap;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

        /*Robot t1000Replace =(T1000)context.getBean("t1000Replace");
        t1000Replace.fire();*/
      /*  T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
        t1000Pool.fire();
*/
        T1000 t1000 = (T1000)context.getBean("t1000");
        t1000.fire();


    }
}
