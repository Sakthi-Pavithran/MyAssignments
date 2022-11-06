package week1.day1;

public class TwoWheeler {

	public int noOfWheels=2;
	public short noOfMirrors=2;
	public long chassisNumber=123456L;
	public boolean isPunctured=true;
	public String bikeName="PulserRS";
	public double runningKM=1234.56;
		
	public static void main(String[] args) {
		TwoWheeler bike= new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);
		
	}
}
