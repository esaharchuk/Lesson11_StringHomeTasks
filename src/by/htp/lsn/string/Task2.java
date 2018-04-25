package by.htp.lsn.string;

public class Task2 {
	// В тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в
	// одной строке печатать текст с двумя пробелами между буквами, в следующей
	// строке внизу под каждой буквой печатать ее номер.

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
