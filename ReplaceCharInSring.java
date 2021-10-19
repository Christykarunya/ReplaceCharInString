package week3.day2;

public class ReplaceCharInSring {

	public static void main(String[] args) {
		String sentence="I am learning Java8";
		int length = sentence.length();
		
		System.out.println("Input String :"+sentence);
		System.out.println("Length of the string :"+length);
		
		String replace = sentence.replace("8", "11");
		System.out.println(replace);
		
		//to get substring from char 5[4-Index] to 14[13-Index](includes Starting index,excludes ending index)
		String substring = sentence.substring(4, 14);
		System.out.println("Substring is :"+substring);
	

	}

}
