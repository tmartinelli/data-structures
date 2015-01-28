package br.com.tmartinelli.datastructures.vector;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Student)) return false;
		Student other = (Student) obj;
		return name.equals(other.name);
	}
}
