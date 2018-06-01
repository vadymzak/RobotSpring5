package ua.javabegin.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.javabegin.spring.impl.conveyor.T1000Conveyor;
import ua.javabegin.spring.impl.robot.T1000;
import ua.javabegin.spring.interfaces.Robot;
import ua.javabegin.spring.interfaces.RobotConveyor;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

        RobotConveyor robotConveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        Robot terminator1 = robotConveyor.getRobot();
        Robot terminator2 = robotConveyor.getRobot();
        Robot terminator3 = robotConveyor.getRobot();

        System.out.println("Terminator1 - " + terminator1);
        System.out.println("Terminator2 - " + terminator2);
        System.out.println("Terminator3 - " + terminator3);

    }
}
