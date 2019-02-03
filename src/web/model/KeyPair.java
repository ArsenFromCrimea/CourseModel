package web.model;


import model.uml.Science;
import model.uml.Student;

/**
 * ������ �������, �� ����, ���������������� ������ ������ ���� ���� �������.
 * 
 * @author Arsen Pan
 */
public class KeyPair {
	private final Science course;
	private final Student student;

	public KeyPair(Science course, Student student) {
		this.course = course;
		this.student = student;
	}

	public Science getCourse() {
		return course;
	}

	public Student getStudent() {
		return student;
	}

}
