package ua.javabegin.spring.pool;

import ua.javabegin.spring.interfaces.Robot;
import ua.javabegin.spring.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection <Robot> robotCollection;

    @Override
    public Collection <Robot> getCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection <Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void fire() {
        for (Robot robot : robotCollection) {
            robot.fire();
        }
    }
}
