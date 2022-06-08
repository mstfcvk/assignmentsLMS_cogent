package AssignmentsInLMS_week1;

import java.util.Scanner;

class CalculateMonth {

	public String getMonth(int num) {
		
		String month = "";
		Object myObj = num;
		
		System.out.println("int num: "+num);
		System.out.println("myObj: "+myObj);
		
		if(num > 0 && num < 13) {
			
			switch (num) {
            case 1:  month = "January";
                     break;
            case 2:  month = "February";
                     break;
            case 3:  month = "March";
                     break;
            case 4:  month = "April";
                     break;
            case 5:  month = "May";
                     break;
            case 6:  month = "June";
                     break;
            case 7:  month = "July";
                     break;
            case 8:  month = "August";
                     break;
            case 9:  month = "September";
                     break;
            case 10: month = "October";
                     break;
            case 11: month = "November";
                     break;
            case 12: month = "December";
            		 break;
			}
			return month;
			
		} else if(num < 1 && num > 12) {
				throw new InvalidChoiceException("Please enter a number between 1-12.");
				
			} else if(myObj instanceof Integer) {
				throw new NotANumberException("Please enter a number.");
			}
			
			return month;
	}

	public int getInt(int num) {
		switch(num) {
		case 1: num = 1;
		break;
		case 2: num = 2;
		break;
		}
		return num;
	}
		
}



