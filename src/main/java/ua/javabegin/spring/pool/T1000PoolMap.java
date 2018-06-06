package ua.javabegin.spring.pool;

import ua.javabegin.spring.interfaces.Robot;
import ua.javabegin.spring.interfaces.RobotPoolMap;

import java.util.Iterator;
import java.util.Map;

public class T1000PoolMap implements RobotPoolMap {

    private Map<String, Robot> robotMap;

    public T1000PoolMap(Map<String, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public Map<String, Robot> getRobotMap() {
        return robotMap;
    }

    @Override
    public void setRobotMap(Map <String, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    @Override
    public void fire() {
        Iterator<Map.Entry<String, Robot>> iterator = robotMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Robot> robotEntry = iterator.next();
            System.out.println(robotEntry.getKey() + " " + robotEntry.getValue());
        }

    }
}
