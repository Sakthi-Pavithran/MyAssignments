package week1.day2.Assignments;



public class FindIntersection {

	public static void main(String[] args) {
		
		int firstData[]=  {3,2,11,4,6,7};
		int secondData[]= {1,2,8,4,9,7};
		
		for (int i = 0; i < firstData.length; i++) {
			for (int j = 0; j < secondData.length; j++) {
				if(firstData[i]==secondData[j]) {
					System.out.println(firstData[i]);
				}
				
			}
			
		}

	}

}
