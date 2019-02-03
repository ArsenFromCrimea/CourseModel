package model.uml;

public class Professor extends Man {
	private final static int PERCENTS_OF_PROFESSOR = 50;
	private final float salary;

	public Professor(String name, String address, String phone, float salary,
			Science course) throws ProfessorException {
		super(name, address, phone);
		if (course.getProfessor() != null) {
			throw new ProfessorException("����� ��� ������");
		}
		this.salary = salary;
		if (course.getPrice() * PERCENTS_OF_PROFESSOR / 100 < salary) {
			throw new ProfessorException(
					"����� �� �������� �� ������������� ������ ����������");
		}
		course.setProfessor(this);
	}

	public float getSalary() {
		return salary;
	}

	public Science getCourse() {
		for (Science course : Science.values()) {
			if (course.getProfessor() == this) {
				return course;
			}
		}
		return null;
	}

	/**
	 * � ����������� ��� ���, ��� � ������� ���� ������� Dr.
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Dr. " + name;
	}

}
