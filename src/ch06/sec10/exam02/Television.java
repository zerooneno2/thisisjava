package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model ="lcd";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
