package by.htp.lsn.string;

public class Change {

	public static void main(String[] args) {
		
		
		String str = "Java no functional place";
		
		StringBuilder good = new StringBuilder();
		good.append(str);
		int count = 0;
		int k = 2;
		char temp = 'k';
		
		for(int i = 0; i < good.length(); i++) {
			if(good.charAt(i) != ' ') {
				count++;
				if (count % k == 0) {
					good.setCharAt(i, temp);
				}
					
		}
		System.out.println(good.toString());
		
		}
	}

}
