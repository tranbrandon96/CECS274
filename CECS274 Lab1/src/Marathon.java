// Brandon Tran
// Class 274-05
// Project: Marathon
// Due: (Sept 18, 2018)

import java.util.Scanner;

public class Marathon {
	public static void main(String[] args)
	{
		// Declaration of Variables
		Scanner in = new Scanner(System.in);
		String name;
		double distance = 0;
		
		int time_h = 0;
		int time_m = 0;
		int time_s = 0;
		
		double pace = 0;
		int pace_m = 0;
		int pace_s = 0;
		
		double marathon = 0;
		int marathon_h = 0;
		double marathon_h1 = 0;
		int marathon_m = 0;
		double marathon_m1 = 0;
		double marathon_s = 0;
		double marathon_s1 = 0;
		
		double tenk = 0;
		int tenk_h = 0;
		double tenk_h1 = 0;
		int tenk_m = 0;
		double tenk_m1 = 0;
		double tenk_s = 0;
		double tenk_s1 = 0;
		
		// Ask user for name
		System.out.print("What is your name? ");
		name = in.next();
		
		// Ask user for how many miles did they run
		System.out.print("How far did you run today? ");
		distance = in.nextDouble();
		
		// Ask user how long did the mile took
		System.out.print("How long did it take? ");
		System.out.print("hours: ");
		time_h = in.nextInt();
		System.out.print("                      minutes: ");
		time_m = in.nextInt();
		System.out.print("                      seconds: ");
		time_s = in.nextInt();
		
		// Pace Calculations
		
		pace = (time_s + (time_m * 60) + (time_h * 3600)) / distance;
		pace_m = (int)pace / 60;
		pace_s = (int)pace % 60;
		
		
		
		// Marathon Time Calculations
		marathon = pace * 26.2;
		marathon_h = (int)marathon / 3600; 
		marathon_h1 = (marathon / 3600.0) - marathon_h ; 	
		
		marathon_m1 = marathon_h1 * 60; 
		marathon_m = (int)marathon_m1; 
		
		marathon_s1 = marathon_m1 - marathon_m;
		marathon_s = marathon_s1 * 60;
	
		// 10k Calculations
		tenk = pace * 6.211180124223602;
		tenk_h = (int)tenk / 3600;
		tenk_h1 = tenk / 3600;
		 
		tenk_m1 = tenk_h1 * 60; 
		tenk_m = (int)tenk_m1; 
		
		tenk_s1 = tenk_m1 - tenk_m;
		tenk_s = tenk_s1 * 60;
		
		// Results
		System.out.println("\nHi "+name+", ");
		System.out.println("Your pace is " + pace_m + ":" + ((pace_s <= 9) ? "0" + pace_s : pace_s) + " (minutes:seconds)");
		System.out.println("At this rate your marathon time would be " + marathon_h + ":" + ((marathon_m <= 9) ? "0" + marathon_m : marathon_m) + ":" + ((marathon_s < 9) ? "0" + Math.round(marathon_s) : Math.round(marathon_s)));
		System.out.println("and your 10k time would be " + tenk_h + ":" + ((tenk_m <= 9) ? "0" + tenk_m : tenk_m) + ":" + (int)tenk_s);
		System.out.println("Good luck with your training!");
		System.out.println();
		
		System.out.println("Pace\t\t\t10K Time\t\t\tMarathon Time");
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		pace_m = 4;
		pace_s = 41;
		
		
		for (int index = 0; index <= 7; ++index)
		{
			
			int seconds;
			if (pace_s >= 60)
			{
				
				pace = (pace_m * 60) + pace_s;
				
				//10k Calculations
				tenk = pace * 6.211180124223602;
				tenk_h = (int)tenk / 3600;
				tenk_h1 = tenk / 3600;
				 
				tenk_m1 = tenk_h1 * 60; 
				tenk_m = (int)tenk_m1; 
				
				tenk_s1 = tenk_m1 - tenk_m;
				tenk_s = tenk_s1 * 60;
				
				// Marathon Time Calculations
				marathon = pace * 26.2;
				marathon_h = (int)marathon / 3600; 
				marathon_h1 = (marathon / 3600.0) - marathon_h ; 	
				
				marathon_m1 = marathon_h1 * 60; 
				marathon_m = (int)marathon_m1; 
				
				marathon_s1 = marathon_m1 - marathon_m;
				marathon_s = marathon_s1 * 60;
				
				++pace_m;
				seconds = pace_s - 60;
				System.out.print(pace_m + ":" + ((seconds <= 9) ? "0" + seconds : seconds) + "\t\t\t" + tenk_m + ":" + (((int)tenk_s <= 9) ? "0" + (int)tenk_s : (int) tenk_s ) + "\t\t\t\t" + marathon_h + ":" + ((marathon_m <= 9) ? "0" + marathon_m : marathon_m) + ":" + ((marathon_s < 9) ? "0" + Math.round(marathon_s) : Math.round(marathon_s)) + "\n");
				pace_s = seconds + 30;
				
				
			}
			else 
			{
				pace = (pace_m * 60) + pace_s;
				
				//10k Calculations
				tenk = pace * 6.211180124223602;
				tenk_h = (int)tenk / 3600;
				tenk_h1 = tenk / 3600;
				 
				tenk_m1 = tenk_h1 * 60; 
				tenk_m = (int)tenk_m1; 
				
				tenk_s1 = tenk_m1 - tenk_m;
				tenk_s = tenk_s1 * 60;
				
				// Marathon Time Calculations
				marathon = pace * 26.2;
				marathon_h = (int)marathon / 3600; 
				marathon_h1 = (marathon / 3600.0) - marathon_h ; 	
				
				marathon_m1 = marathon_h1 * 60; 
				marathon_m = (int)marathon_m1; 
				
				marathon_s1 = marathon_m1 - marathon_m;
				marathon_s = marathon_s1 * 60;
				
				System.out.printf(pace_m + ":" + ((pace_s <= 9) ? "0" + pace_s : pace_s) + "\t\t\t" + tenk_m + ":" + (((int)tenk_s <= 9) ? "0" + (int)tenk_s : (int) tenk_s ) + "\t\t\t\t" + marathon_h + ":" + ((marathon_m <= 9) ? "0" + marathon_m : marathon_m) + ":" + ((marathon_s <= 9) ? "0" + Math.round(marathon_s) : Math.round(marathon_s)) + "\n");
				pace_s = pace_s + 30;
			}
			
			
		}
	}
} // end of class Marathon

