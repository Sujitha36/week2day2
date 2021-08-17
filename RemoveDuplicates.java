package assignmentweek2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "compared to java Selenium is much easier than java for now";
		String[] A = text.split(" ");
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i].equals(A[j])) {
					count = count + 1;
				}

				if (count>=1) {
					A[j]=A[j].replace(A[i],"");
					//System.out.println(i+" "+j);
					//count=0;
				}
}
			System.out.print(" "+A[i]+" ");

		}

	}
	}


