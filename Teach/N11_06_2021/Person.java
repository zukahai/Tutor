package N11_06_2021;

public class Person extends Animal{
    String address;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person() {
        super();
        this.address = "";
    }

    public Person(String name, String gender, int age, String address) {
        super(name, gender, age);
        this.address = address;
    }

    public void display() {
        super.display();
        System.out.println("Address = " + this.address);
    }
}