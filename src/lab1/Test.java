package lab1;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Shaggy", 3);
        Dog dog2 = new Dog("Pepper", 5);
        Dog dog3 = new Dog("Chuck");
        dog3.setAge(1);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();

        Book book1=new Book("Crime and Punishment", 672);
        Book book2=new Book("White Fang", 254);
        System.out.println(book1);
        book2.Somebook();

        Ball ball = new Ball("soccer", 10.9, "black and white");
        System.out.println(ball);
    }
}
