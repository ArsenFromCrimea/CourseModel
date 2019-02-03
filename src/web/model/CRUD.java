package web.model;

import java.util.List;

import model.uml.Process;

/**
 * CRUD-�������� � ��������� ������ � web-����������,
 * ������ ��� ������ ��� (��� ����� ��������� ���������)
 * ��������� ������������� ������������ ����� ���� ������
 * ���������. ���������� ���������� �������� � ����������������
 * ����� � �������, ������� ������, ����� ��� � offline-������
 * ������ ����������� �������� ���������, �� ������
 * @author Arsen Pan
 */

public class CRUD {

	public static void createProcess(KeyPair keypair) {
		keypair.getCourse().addStudent(keypair.getStudent());
	}

	/**
	 * ��������, ��� ��� �� ���������������� (�� ������������ �� get), � �����
	 * �� ��� ���� ����, ����� ����������� ��������� CRUD
	 * 
	 * @param course
	 * @param student
	 * @return
	 */
	public static Process readProcess(KeyPair keypair) {
		return keypair.getCourse().getProcessByStudent(keypair.getStudent());
	}

	public static void updateProcess(List<Integer> marks, KeyPair keypair) {
		List<Integer> ourMarks = readProcess(keypair).marks;
		ourMarks.clear();
		ourMarks.addAll(marks);
	}

	public static void deleteProcess(KeyPair keypair) {
		keypair.getCourse().deleteStudent(keypair.getStudent());
	}

}
