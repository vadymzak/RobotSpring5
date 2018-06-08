package ua.javabegin.spring.impl.robot;

public class T1000 extends BaseModel{

    private String color;

    private  int year;

    private boolean soundEnabled;

    public T1000(){}
/*

    public T1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }
*/

  /*  public T1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }*/
 /*   public T1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }
*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
