
public class Person {
	
	private String name;
	private String vorname;
	private int alter;
	
	public Person(String vorname, String name, int alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public int getAlter() {
		return alter;
	}
}
