package by.htp.lsn.string;

//�� ������ ������� ��� �������, ����� ��������, �� ���������� �������. 
//������������������������� ������ ������ ���� �������� ���� �� ���� ������.
public class Task3 {

	public static void main(String[] args) {

		String text = "Every 3 * 5, but no one 5 * 3 in very simple words";

		char[] charArray = text.toCharArray();

		for (char x : charArray) {
			if (Character.isLetter(x)){
				System.out.print(x + " ");
				

			}
		}
	}

}
