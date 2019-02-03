package gui;
/**
 * 
 * � �� ���, ������� refreshTableOfProcesses() �������� �������� ��
 * WEB-���������� (���� ����� �������� �� �������), ��
 * � �� �����, ����� ������� ��������� �������������
 * WEB-����������. � ��������� ������
 * ���������� ���� ���� �� ����, � � ��
 * ������ GUI-���������� ����� ����� ���������� 
 * @author Arsen Pan
 *
 */

public class Engine extends Thread {
	private final static int FRAMERATE = 25;
	static {
		Engine engine = new Engine();
		engine.start();
	}

	/**
	 * � ��������� ��� �������������
	 * �������� 25 ������ � �������,
	 * �� ��� ���������� ������ ��������� ��������� ������������
	 * ��������� � ������.
	 */
	public void run() {
		do {
			ViewerAndController.refreshTableOfProcesses();
			try {
				Thread.sleep(1000 / FRAMERATE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
	}
	/**
	 * ���� ��� ����� ����� � ���������� ����������.
	 * �� �����������, ��� ���
	 * ������. � ����������������� �����������
	 * �������������� ������ "��������" ��
	 * ����� �����
	 * (����� ��� ��
	 * �� � �� ������ � �� ��������)
	 * 
	 * @param arguments
	 */
	public static void main(String[] arguments) {

	}
}
