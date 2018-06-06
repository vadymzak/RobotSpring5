package ua.javabegin.spring.interfaces;

import java.util.Map;

public interface RobotPoolMap {

    Map<String, Robot> getRobotMap();

    void setRobotMap(Map <String, Robot> robotMap);

    void fire();

}
