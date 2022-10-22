package LenghtOfLastWord;

public class expm1 {

	public static int lenghtOfst (String str) {


		int count =0;
		String newStr = str.trim();

		if(str.length()==0) {
			return count;
		}

		int len = newStr.length();
		String [] arrstr = newStr.split(" ");

		for(int i=1; i<arrstr.length ; i++) {
			while(i!= arrstr.length-1) {
				i++; 
			}
			int wordlen=  arrstr[i].length();
			count= wordlen;
		}
		return count;
	}
	public static void main(String[] args) {

		String str = "nvjdk      jk";

		System.out.print( lenghtOfst(str) );


	}

}
