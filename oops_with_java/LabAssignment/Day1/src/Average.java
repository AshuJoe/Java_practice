
import java.util.Scanner;

class Average{
	public static void main(String[] args){
		System.out.println("Enter 2 double values: ");
		Scanner sc=new Scanner(System.in);
		
		if(sc.hasNextDouble()){
			double num1 = sc.nextDouble();
			if(sc.hasNextDouble()){
				double num2 =sc.nextDouble();
				if(num2==0){
					System.out.println("Invalid input");
				}
				else{
				double avg=(num1+num2)/2;
		System.out.println("Avg is: "+avg);
				}
			}
			else{
				System.out.println("Invalid Input. PLease Enter Double values ");
			}
		}
	else{
			System.out.println("Invalid Input. PLease Enter Double values ");
	}
		
	sc.close();
}
}