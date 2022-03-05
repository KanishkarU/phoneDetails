package org.phone;
//method overloading based on datatype order
public class Phone {
	
	private void phoneInfo(String name,int imeiNo) {
		System.out.println("Phone Name is "+name+"\n"+"Phone Imei nos is "+imeiNo);
		

	}
	private void phoneInfo(long serialNum,String processorName) {

System.out.println("Phone serial number is "+serialNum+"\n"+"phone processor name is "+processorName);

	}
	public static void main(String[] args) {
		Phone a = new Phone();
		a.phoneInfo("Realme", 158725);
		a.phoneInfo(718628751752768l, "Android");
	}

}
