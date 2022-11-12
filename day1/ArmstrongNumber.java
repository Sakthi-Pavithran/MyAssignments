package week1.day2.Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input=371;
		int calculated=0;
		int remainder;
		int original=input;
		
		while(input>0) {
			remainder=input%10;
			input=input/10;
			calculated= calculated+remainder*remainder*remainder;
		}
		if (calculated==original) {
			System.out.println("Its Armstrong number");
		}
		else
			System.out.println("Not Armstrong number");

	}

}
