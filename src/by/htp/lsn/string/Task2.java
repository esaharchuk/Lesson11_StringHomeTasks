package by.htp.lsn.string;

public class Task2 {
	// � ������ ������ ����� �������� �� ���������� ������� � ��������. ��� ������ �
	// ����� ������ �������� ����� � ����� ��������� ����� �������, � ���������
	// ������ ����� ��� ������ ������ �������� �� �����.

	public static void main(String[] args) {

		String str = "Distinguished guests brothers and sisters";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] charArray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(charArray[i] + "  ");
		}
		System.out.println("");

		for (char x : charArray) {
			if (x == ' ') {
				System.out.print("");
			} else {
				int i = alphabet.lastIndexOf(x);
				i += 1;
				System.out.print(i + "  ");
			}
		}

	}

}
