package ua.javabegin.spring.pool;


import org.springframework.beans.factory.annotation.Autowired;
import ua.javabegin.spring.annotations.RobotType;
import ua.javabegin.spring.enums.ColorStyle;
import ua.javabegin.spring.impl.robot.T1000;
import ua.javabegin.spring.interfaces.Robot;

public class T1000Pool {

    @Autowired
    @RobotType(color = ColorStyle.GOLD)
    public Robot goldRobot;

    public Robot getGoldRobot() {
        return goldRobot;
    }

    public void setGoldRobot(Robot goldRobot) {
        this.goldRobot = goldRobot;
    }

    public void print(){
        goldRobot.fire();
    }

}
