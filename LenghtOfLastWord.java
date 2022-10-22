/* 
Given a string str consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only. 
*/

package LenghtOfLastWord;

public class LenghtOfLastWord {

	public static int lenghtOfst (String str) {


		int count =0;
		String newStr = str.trim();

		if(str.length()==0) {
			return count;
		}

		int len = newStr.length();
		String [] arrstr = newStr.split(" ");

		for(int i=0; i<arrstr.length ; i++) {
			while(i!= arrstr.length-1) {
				i++; 
			}
			int wordlen=  arrstr[i].length();
			count= wordlen;
		}
		return count;
	}
	public static void main(String[] args) {

		String str = "Hello World";

		System.out.print( lenghtOfst(str) );


	}
}
