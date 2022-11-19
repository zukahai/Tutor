package Course;

public class Course {
    private int id;
    private String name;
    private int credits;

    public Course() {
        this.id = 0;
        this.name = "";
        this.credits = 0;
    }

    public Course(int id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public String toString() {
        return "[ID=" + this.id + ", Name=" + this.name + ", Credits=" + this.credits + "]";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
