
//**********************************************************************
// Fingerprint Classification 
//**********************************************************************

import java.util.Scanner;

public class fingerprint {
	
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		//main variables
		int cores = 0;			int counter1 = 0;		int counter5 = 0;
		int deltas = 0;			int atotal = 0;			int counter6 = 0;
		int wtotal;				int parchtotal =0;
		int TarchsTotal= 0;		int ltotal = 0;
		int counter2 = 0;
		int pwhorlsTotal = 0;	int counter3 = 0;
		int awhorlsTotal = 0;	double avgA;
		int dwhorlsTotal = 0;	int counter4 = 0;
		 
		//do while loop
		do{
			
			//prompt user to enter the number of cores and deltas they see with-in the fingerprint
			System.out.println("Enter the number of CORES the fingerprint has: ");
			cores = myScanner.nextInt();
			
			System.out.println("Enter the number of DELTA'S the fingerprint has: ");
			deltas = myScanner.nextInt();
			 
			
		//the algorithm that checks to see which classification the fingerprint falls under
		if(cores == 0 && deltas == 0)
		{
		  //keeping total amount of archs
		  counter1++;
		  parchtotal += counter1;
		  System.out.println("The fingerprint has an Arch pattern. ");
	    }
		
		if(cores == 1 && deltas == 0)
		{
			//keeping total amounts of archs
			counter2++;
			TarchsTotal += counter2;
			System.out.println("The fingerprint has an Arch pattern and it is a Tented Arch. ");
		}
		
		if(cores == 1 && deltas == 1)
		{
			//keeping the total number of loops
			counter3++;
			ltotal += counter3;
			System.out.println("The fingerprint has a LOOP pattern. ");
		}
	  
		if(cores == 1 && deltas == 2)
		{
			//keeping the total number of whorls
			counter4++;
			pwhorlsTotal += counter4;
			System.out.println("The fingerprint has a WHORL pattern and it is a Plain Whorl. ");
		}
		
		if(cores == 2 && deltas == 2)
		{
			//keeping the total number of whorls
			counter5++;
			awhorlsTotal += counter5;
			System.out.println("The fingerprint has a WHORL pattern and it is a Acidental Whorl. ");
		}
		
		if(cores == 2 && deltas == 3)
		{
			//keeping the total number of whorls
			counter6++;
			dwhorlsTotal += counter6;
			System.out.println("The fingerprint has a WHORL pattern and it is a Double Looped Whorl. ");
		}
		 
		//end of do while loop
		}while(cores != 9 && deltas != 9);
		
	
		//combining the totals of archs and whorls
		atotal = parchtotal + TarchsTotal;
		wtotal = awhorlsTotal + dwhorlsTotal + pwhorlsTotal;
		
		//displays the totals of each pattern
		System.out.println("total number of archs " + atotal);
		System.out.println("total number of loops " + ltotal);
		System.out.println("total number of whorls " + wtotal);
		
		avgA = (atotal + ltotal + wtotal)/ atotal;
		
		//displays the average of each pattern
		System.out.println("The average of fingerprints with Arch patterns is " + avgA);
  }

	//outside the main
	
}
