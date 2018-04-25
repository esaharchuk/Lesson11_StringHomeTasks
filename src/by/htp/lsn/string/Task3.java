package by.htp.lsn.string;

//»з текста удалить все символы, кроме пробелов, не €вл€ющиес€ буквами. 
//ћеждупоследовательност€ми подр€д идущих букв оставить хот€ бы один пробел.
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
