package OOP;

public class Person {

    public void eat(String a) {
        System.out.println("I eat " + a);
    }

    public void eat(String a, String b) {
        System.out.println("I eat " + a + " and" + b);
    }
}

class CalculateArea {

    public static void main(String[] args) {
        Person a = new Person();
        a.eat("apple");
        a.eat("tomato", "photo");
    }
}

// I eat apple
// I eat tomato and photo
