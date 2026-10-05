package practice;

import genericUtility.JavaUtility;

public class JavaUtilityPractice {
	public static void main(String[] args) {
		
		JavaUtility ju = new JavaUtility();
		String value1 = ju.getCalendarDetails("dd-MM-YYYY");
		System.out.println(value1);
		
		String value2 = ju.getCalendarDetails("dd-MM-YY hh-mm-ss");
		System.out.println(value2);
		
		int number = (int)(Math.random()*9999);
		System.out.println(number);
		
		int num = ju.generateRandomNumber(25000);
		System.out.println(num);	
		}
	}



