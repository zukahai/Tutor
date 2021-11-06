package N11_06_2021;

public class Hai extends Person{
    int a, b, c;

    public Hai() {
        super();
        this.a = 0;
        this.b = 0;
        this.b = 0;
    }

    public Hai(String name, String gender, int age, String address, int a, int b, int c) {
        super(name, gender, age, address);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        super.display();
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
}
