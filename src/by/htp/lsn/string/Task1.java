package by.htp.lsn.string;

public class Task1 {
	// � ������ ����� ������ k-� ����� �������� �������� ��������.
	// ���� k ������ ����� �����, ������������� �� ���������.

	public static void main(String[] args) {

		String str = "Distinguished guests brothers and sisters";
		String[] arr = str.split(" ");
		int k = 2;
		char h = '*';
		char[] newArr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			newArr = arr[i].toCharArray();
			newArr[k - 1] = h;
			arr[i] = String.copyValueOf(newArr);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
