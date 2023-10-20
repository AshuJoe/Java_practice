
import src.tester.Point2D;
import java.util.Scanner;

public class Testpoints {
    public static void main(String[] args) {
        System.out.println("enter no of points to plot: ");
        int num1;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        Point2D[] parr = new Point2D[num1];
        for (int i = 0; i < num1; i++) {

            parr[i] = new Point2D(sc.nextFloat(), sc.nextFloat());
            if (i == 0) {
                continue;
            } 
            else {
                for (int j=1;j<=i;j++){
                if (parr[i].getX() == parr[j - 1].getX() && parr[i].getY()==parr[j-1].getY()) {
                    System.out.println("already plotted,Enter again :");
                    parr[i] = new Point2D(sc.nextFloat(), sc.nextFloat());
                }
            }

        }

        for (Point2D point2d : parr) {
            System.out.println(point2d.show());
        }
        
        // for(int i=0;i<num1;i++){
        //     parr[i] = new Point2D(sc.nextFloat(), sc.nextFloat());
        // }
        // System.out.println("enter the indices to test equality");
        // int ind1=sc.nextInt();
        // int ind2=sc.nextInt();
        // if (parr[ind1].isEqual(parr[ind2]))
        // System.out.println("points are equal");
        // else{
        //     System.out.println("Distance btw 2 points are : ");
        //     System.out.println(parr[ind1].calculateDistance(parr[ind2]));
        // }
        sc.close();
    }
}
