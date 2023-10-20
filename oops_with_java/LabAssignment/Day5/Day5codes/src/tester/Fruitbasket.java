package tester;
import com.app.fruits.*;

import java.util.Scanner;

public class Fruitbasket {
    public static void main(String[] args) {
    	System.out.println("Choose option: as per lab assignment starting from 4.10 (1,2,3) as 1 and so on...");
        Scanner sc = new Scanner(System.in);
        int option=0;
        int basketsize =3;
        Fruit[] frs = new Fruit[basketsize];
        do{ 
        	option=sc.nextInt();
            
        switch (option) {
        case 1:System.out.println("choose one of the following\n1:Add mango\n2:AdD orange\n3:Add apple");
		        for (int i = 0; i < basketsize; i++) {
		            int choose = sc.nextInt();
		            switch (choose) {
		                case 1:
		                    System.out.println("Enter weight :");
		                    frs[i] = new Mango("yellow", sc.nextDouble(), true, "Mango");
		                    System.out.println("Mango added....");
		                    break;
		                case 3:
		                System.out.println("enter weight :");
		                    frs[i] = new Apple("red", sc.nextDouble(), true, "Apple");
		                    System.out.println("Apple added....");
		                    break;
		                case 2:
		                System.out.println("enter weight :");
		                    frs[i] = new Orange("orange", sc.nextDouble(), true, "Orange");
		                    System.out.println("Orange added....");
		                    break;
		                }
                     }
		         break;
	        case 2:
			        for (int i=0;i<basketsize;i++){
			            System.out.println(frs[i].getName());
			        }
			        break;
	        case 3:
			        for (int i=0;i<basketsize;i++){
			            System.out.println("Details of "+(i+1)+"th fruit "+"Name: "+frs[i].getName()+" Color: "+frs[i].getColor()+" Weight: "+frs[i].getWeight()+" Taste: "+frs[i].taste());
			        }
			        break;
	        case 4:
	        	     System.out.println("Enter the index to set the fruit stale :");
			         int index=sc.nextInt();
			         if (index<0 || index>basketsize) {
			        	 System.out.println("Error : invalid index");
			         }
			         else {
			        	 frs[index].setfresh(false);
			         }
			         System.out.println(frs[index].getName()+" "+frs[index].getFresh());
			         break;
	        case 5:
			        for (Fruit p:frs) {
			        	if (p.taste().equals("sour")) {
			        		p.setfresh(false);
			        	}}
			         System.out.println("Fruits with sour taste marked as stale....");
			        	break;
			 case 6:
				 System.out.println("specify the fruit index of fruit to create pulp,juice or jam....");
			        index=sc.nextInt();
			        Fruit p=frs[index];
			        if (p instanceof Mango) {
			        	((Mango) p).pulp();
			        }
			        else if (p instanceof Apple) {
			        	((Apple) p).juice();
			        }
			        else if(p instanceof Orange) {
			        	((Orange) p).jam();
			        }
                   break;
			 case 7:System.out.println("Thank u...visit again");
			        break;
        }
           
    }while(option!=7);
    sc.close();
    }
};