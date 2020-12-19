package lab10;

public class VictorianChair extends ChairFactory implements Chair {
    private int age;

    public VictorianChair(int age) {
        age = 100;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }
}

