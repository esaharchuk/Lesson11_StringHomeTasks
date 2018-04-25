package by.htp.lsn.string;

public class Task24 {
	// Определить сумму всех целых чисел, встречающихся в заданном тексте.

	public static void main(String[] args) {

		String text = "1 sdfgf 8 sdsd21";

		StringBuilder temp = new StringBuilder();
		int summ = 0;

		for (char symbol : text.toCharArray()) {

			if (Character.isDigit(symbol)) {
				temp.append(symbol);
			} else if (temp.length() > 0) {
				summ += Integer.parseInt(temp.toString());
				temp = new StringBuilder();
			}

		}
		if (temp.length() > 0) {
			summ += Integer.parseInt(temp.toString());
		}

		System.out.println(summ);

	}

}
