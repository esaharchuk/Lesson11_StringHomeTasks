package by.htp.lsn.string;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String str = new String();
		String str2 = new String();

		String str3 = "123456";
		String str4 = "123456";

		String str5 = new String("a");
		String str6 = new String("b");

		String str7 = "b";
		String str8 = str7 + "c";

		String str9 = str8.replace("c", "a");

		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");

		String strBefore = "heLLo, privEt!23,_ %@()\".;@ kl \n wow";

		String strAfter1 = strBefore.replaceAll("\\W|[0-9]|[_]", "");
		// String strAfter2 = strBefore.replaceAll("[^a-z^A-Z]", "");

		System.out.println(strAfter1);
		// System.out.println(strAfter2);
	}

}
