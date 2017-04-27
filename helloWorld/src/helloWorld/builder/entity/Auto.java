package helloWorld.builder.entity;

public class Auto {

	private String mark;
	
	public Auto(String mark){
		this.mark = mark;
	}
	
	
	@Override
	public String toString() {
		return new StringBuilder().append("Mark: ").append(mark).toString();
	}
}
