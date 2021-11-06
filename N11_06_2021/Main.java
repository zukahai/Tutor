package N11_06_2021;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Hai", "Nam", 22, "Ha Tinh");
        p.setAge(10);
        p.nextAge();
        p.display();
    }
}