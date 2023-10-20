package Day4.tester;

import java.util.Scanner;
import static java.lang.System.*;
import Day4.core.*;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		out.print("enter number of point to be plotted : ");
		Point2D[] points = new Point2D[sc.nextInt()];
		while (true) {
			out.println(
					"choose following options :\n1)plot a point\n 2)Display point \n3)IsEqual & if not then Distance\n4)exit");
			switch (sc.nextInt()) {
				case 1:
					System.out.println("enter index on which you want to store point");
					int n = sc.nextInt();
					if (n <= points.length && n > 0) {
						if (points[n - 1] == null) {
							out.println("enter new co-ordinates of point");
							points[n - 1] = new Point2D(sc.nextDouble(), sc.nextDouble());
						} else {
							System.out.println("point already plotted");
						}
					} else
						System.out.println("invalid index");
					break;
				case 2:
					for (Point2D p : points) {
						if (p == null)
							continue;
						else
							System.out.println("point is " + p.getPointDetails());
					}
					break;
				case 3:
					System.out.println("enter any two indexes");
					int l = sc.nextInt();
					int m = sc.nextInt();
					if (l <= points.length && m <= points.length && l > 0 && m > 0 && points[l - 1] != null
							&& points[m - 1] != null) {
						if (l == m) {
							System.out.println("both indexes are same");
						} else {
							System.out.println(points[l - 1].isEqual(points[m - 1]));
						}
					} else {
						System.out.println("Invalid index");
					}
					break;
				case 4:
					System.out.println("Goodbye");
					sc.close();
					exit(0);
				default:
					System.out.println("Invalid choice");

			}
		}

	}

}
