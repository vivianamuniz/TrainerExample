package MyPackage;

public class Driver {

	public static void main(String[] args) {
		System.out.print("Hello world");
		
		//Object Instantiation
		MyThing mt = new MyThing();
		
		System.out.println("Say hi to my object, it has a value of " + mt.mySmallNumber);
		
		mt.PrintMyValues();
	}
}
