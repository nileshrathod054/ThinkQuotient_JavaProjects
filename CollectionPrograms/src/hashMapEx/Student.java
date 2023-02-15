package hashMapEx;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name ;
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	

}
