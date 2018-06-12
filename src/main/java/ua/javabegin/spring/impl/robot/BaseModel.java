package ua.javabegin.spring.impl.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ua.javabegin.spring.interfaces.Hand;
import ua.javabegin.spring.interfaces.Head;
import ua.javabegin.spring.interfaces.Leg;
import ua.javabegin.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

    @Autowired
    private Hand hand;
    @Autowired
    private Leg leg;

    @Autowired
    private Head head;

    public BaseModel(){
        System.out.println(this + " BaseModel Constructor");
    }


    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }
    public Hand getHand() {
        return hand;
    }


    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void fire() {
        hand.catchSomething();
        head.thinking();
        leg.go();
    }

    public abstract void dance();
}
