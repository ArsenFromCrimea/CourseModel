package model.uml;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Process {
	final static int COUNT_OF_WEEKS = 17;

	private final static int MAXIMAL_MARK = 5;

	private final Student student;

	private final Science course;

	public final List<Integer> marks;

	/**
	 * ����������� ������ ��������� ������������� ������ ��������, ��� ��� ��
	 * ����� ����� ������ ��� ���������� �������� (addStudent � Course)
	 * 
	 * @param course
	 *            - ����
	 * @param student
	 *            - �������
	 */
	Process(Science course, Student student) {
		this.student = student;
		this.course = course;
		marks = new ArrayList<Integer>();
		Random randomizer = new Random();
		for (int week = 0; week < COUNT_OF_WEEKS; week++) {
			marks.add(randomizer.nextInt(MAXIMAL_MARK + 1));
		}
	}

	public Student getStudent() {
		return student;
	}

	public Science getCourse() {
		return course;
	}

	/**
	 * ������������
	 * 
	 * @return ������� ������
	 */
	public float getAverage() {
		int sum = 0;
		for (Integer mark : marks) {
			sum += mark;
		}
		return sum / (float) marks.size();
	}

	/**
	 * � ����� �����, ��� ���������� ������� ������ �� �������. � ����� ������,
	 * �����, ����� ������� ����� ���������� ���, ��� ��� ������������
	 */
	public float getFinalMark() {
		Integer result = null;
		for (Integer mark : marks) {
			if (result == null || mark > result) {
				result = mark;
			}
		}
		return result;
	}

}
