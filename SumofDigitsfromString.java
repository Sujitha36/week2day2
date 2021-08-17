package assignmentweek2.day2;

public class SumofDigitsfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "sujitha1989";
		int sum = 0;

		String T = text.replaceAll("\\D", "");
		char[] Array = T.toCharArray();
		for (int i = 0; i < Array.length; i++) {
			int num = Character.getNumericValue(Array[i]);
			sum = sum + num;
		}
		System.out.println(sum);

	}

	}


