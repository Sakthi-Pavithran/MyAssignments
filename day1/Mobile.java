package week1.day1;

public class Mobile {

	public String mobileBrandName="Iphone";
	public char mobileLogo='A';
	public short noOfMobilePiece= 12;
	public int modelNumber= 1234567;
	public long mobileImeiNumber= 2345689L;
	public float mobilePrice= 10000.45F;
	public boolean isDamaged= false;
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		
		System.out.println(mob.mobileBrandName);
		System.out.println(mob.mobileLogo);
		System.out.println(mob.noOfMobilePiece);
		System.out.println(mob.modelNumber);
		System.out.println(mob.mobileImeiNumber);
		System.out.println(mob.mobilePrice);
		System.out.println(mob.isDamaged);
	}


}
