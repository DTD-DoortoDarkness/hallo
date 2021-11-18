public class Caesar {


	public static String encrypt(String str, int x) {

		String input= new String(str);
		String output= new String(str);


		// Umwandlung in einem Array mitr Chars

		char[] letter = str.toCharArray();

		for(int i=0; i<letter.length; i++) {   // ändert den Buchstaben um x im Array

			letter[i]= (char) (letter[i] + x);


		}

		output= new String(letter);

		return output;


	}

	public static void main (String[] args) {

		//if(args.length<1) {

			String input=args[0];
			int key= Integer.parseInt(args[1]);

			System.out.print(encrypt(input, key));

			System.out.print(encrypt("HALLO", 3));

		//}


	}



}
