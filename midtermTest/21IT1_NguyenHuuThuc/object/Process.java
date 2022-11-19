package object;

public abstract class Process {
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Process(String name) {
		this.name = name;		
	}
	public abstract void run();
}
