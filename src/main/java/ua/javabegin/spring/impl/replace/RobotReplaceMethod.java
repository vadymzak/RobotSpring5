package ua.javabegin.spring.impl.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class RobotReplaceMethod implements  MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Method was replaced");
        return null;
    }
}
